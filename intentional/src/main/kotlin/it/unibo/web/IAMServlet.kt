@file:JvmName("IAMServlet")
package it.unibo.web

import it.unibo.Intention
import it.unibo.assessext.AssessExecuteExt
import it.unibo.conversational.database.Config
import it.unibo.conversational.database.DBmanager
import it.unibo.describe.DescribeExecute
import kotlinx.coroutines.sync.Semaphore
import org.apache.commons.io.FileUtils
import org.apache.commons.io.filefilter.AgeFileFilter
import org.apache.commons.lang3.time.DateUtils
import org.json.JSONObject
import java.io.File
import java.io.PrintWriter
import java.io.StringWriter
import java.util.*
import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Servlet interface for intentions.
 */
@WebServlet("/IAM")
class IAMServlet : HttpServlet() {
    val cache: MutableMap<String, Intention> = mutableMapOf()

    /**
     * Given a sentence returns the string representing the parsing tree.
     *
     * @param request  request
     * @param response response
     * @throws ServletException in case of error
     * @see HttpServlet.doGet
     */
    @Throws(ServletException::class)
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        var result = JSONObject()
        val error = JSONObject()
        val status: Int
        connectionCounter.release()
        try {
            cleanOldFiles(servletContext.getRealPath("WEB-INF/classes"))
            val value: String = manipulateInString(request.getParameter("value"))
            val sessionID: String = request.getParameter("sessionid")
            error.put("value", value)
            if (!empty(value)) {
                val intention: Intention =
                    if (value.lowercase().contains("describe")) {
                        val session = cache[sessionID]
                        if (session == null) {
                            DescribeExecute.Vcoord.clear()
                            DescribeExecute.Vmemb.clear()
                        }
                        val d = DescribeExecute.parse(cache[sessionID], value, false)
                        result = DescribeExecute.execute(d, servletContext.getRealPath("WEB-INF/classes/"), PYTHON_PATH, makePivot = true, oldInterest = false).first
                        d
                    } else {
                        val a = AssessExecuteExt.parse(value2key(value), 1)
                        result = AssessExecuteExt.execute(a, servletContext.getRealPath("WEB-INF/classes/"), PYTHON_PATH)
                        a
                    }
                cache[sessionID] = intention
                status = OK
                val curCounter = ++counter
                //DBmanager.executeQuery(intention.cube, "insert into intention_sessions values('$sessionID', '${System.currentTimeMillis()}', '$curCounter', '${value.replace("'", "''").replace("\n", "")}', 'this is the actiontype', 1)")
            } else {
                status = ERROR
                result = JSONObject()
                error.put("error", "Empty string")
            }
            write(response, if (status == OK) manipulateOutString(result) else error.toString())
        } catch (ex: Exception) {
            ex.printStackTrace()
            val sw = StringWriter()
            ex.printStackTrace(PrintWriter(sw))
            try {
                error.put("error", ex.localizedMessage)
                error.put("parameters", request.parameterNames.toList().map { Pair(it, request.getParameter(it)) })
                error.put("stacktrace", sw.toString())
                error.put("python", PYTHON_PATH)
                write(response, error.toString())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        connectionCounter.tryAcquire()
        if (connectionCounter.availablePermits == 0) {
            DBmanager.closeAllConnections()
            println("Kill")
        } else {
            println("Skip")
        }
    }

    fun value2key(value: String): String {
        return value.replace("<[\\w\\(\\),\\s\\.]*>".toRegex(), "").replace("\\n".toRegex(), " ").replace("\\s+".toRegex(), " ")
    }

    /**
     * Given a sentence returns the string representing the parsing tree.
     *
     * @param request
     * request
     * @param response
     * response
     * @throws ServletException
     * in case of error
     */
    @Throws(ServletException::class)
    override fun doPost(request: HttpServletRequest, response: HttpServletResponse) {
        doGet(request, response)
    }

    companion object {
        const val OK = 200
        const val ERROR = 500
        val PYTHON_PATH: String = Config.getPython()

        /**
         * Clean old useless files, to avoid to burden the server too much
         */
        fun cleanOldFiles(s: String) {
            /* **********************************************************************
             * CLEAN OLD .CSV FILES
             ********************************************************************** */
            val oldestDate = DateUtils.addMinutes(Date(), -30) // Remove file older than 30 minutes
            val targetDir = File(s)
            val filesToDelete = FileUtils.iterateFiles(targetDir, AgeFileFilter(oldestDate), null)
            while (filesToDelete.hasNext()) {
                val toDelete = filesToDelete.next()
                if (toDelete.name.endsWith(".csv")) {
                    FileUtils.deleteQuietly(toDelete)
                }
            }
        }

        /**
         * Check if empty value
         * @param value value
         */
        fun empty(value: String?): Boolean = value == null || value.isEmpty()

        /**
         * Send the result
         * @param response HTTP response object
         * @param result result
         */
        fun write(response: HttpServletResponse, result: String) {
            response.addHeader("Access-Control-Allow-Origin", "*")
            response.addHeader("Access-Control-Allow-Methods", "GET, POST, PATCH, PUT, DELETE, OPTIONS")
            response.addHeader(
                "Access-Control-Allow-Headers",
                "Origin, X-Requested-With, Content-Type, Accept, X-Auth-Token"
            )
            response.characterEncoding = "UTF-8"
            response.status = OK
            response.outputStream.print(result)
        }

        /**
         * Manipulate the string if needed (e.g., to use more user-friendly names)
         * @param v string tu manipulate
         */
        fun manipulateInString(v: String): String {
            var value = v
            if (v.lowercase().startsWith("with sales ")) {
                value = "$value " //
                    .replace(",", " , ") //
                    .replace(" customer ", " customer_id ") //
                    .replace(" product ", " product_name ") //
                    .replace(" date ", " the_date ") //
                    .replace(" month ", " the_month ") //
                    .replace(" year ", " the_year ") //
                    .replace(" city ", " store_city ") //
                    .replace(" country ", " store_country ") //
                    .replace(" category ", " product_category ") //
                    .replace(" type ", " product_subcategory ") //
                    .replace(" quantity ", " unit_sales ") //
                    .replace(" storeSales ", " store_sales ") //
                    .replace(" storeCost ", " store_cost ") //
                    .replace(" store ", " store_id ")
                return value
            }
            return value
        }

        /**
         * Manipulate the output if needed (e.g., to use more user-friendly names)
         * @param result json object to manipulate
         */
        fun manipulateOutString(result: JSONObject): String {
            return result.toString() //
                .replace("customer_id", "customer") //
                .replace("product_id", "product") //
                .replace("product_name", "product") //
                .replace("store_id", "store") //
                .replace("the_date", "date") //
                .replace("the_month", "month") //
                .replace("the_year", "year") //
                .replace("store_city", "city") //
                .replace("store_country", "country") //
                .replace("product_subcategory", "type") //
                .replace("product_category", "category") //
                .replace("unit_sales", "quantity") //
                .replace("store_sales", "storeSales") //
                .replace("store_cost", "storeCost") //
        }

        var counter: Int = 0
        var connectionCounter = Semaphore(100, 100)
    }
}