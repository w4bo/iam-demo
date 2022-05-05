function chooseChart(id, data, model, isupdate, selectedModel, selectedComponent, highlightColor, colorFun) {
    d3.select("#" + id).html("");
    const n = data["dimensions"].length;
    const prop = {}
    prop["margin"] = {top: 40, right: 90, bottom: 90, left: 90};
    prop["width"] = 600 - prop["margin"]["left"] - prop["margin"]["right"];
    prop["height"] = 400 - prop["margin"]["top"] - prop["margin"]["bottom"];

    console.log(data)
    if (n == 1) {
        // drawMultiline(
        //     id,
        //     prop,
        //     data,
        //     data["dimensions"][0],
        //     data["measures"]);
        drawBar( //drawGroupedColumn(
            id,
            prop,
            data,
            data["dimensions"][0],
            data["measures"][0],
            model,
            1, selectedModel, selectedComponent, highlightColor);
    } else if (n == 2) {
        drawBubble(
            id,
            prop,
            data,
            data["dimensions"][1],
            data["dimensions"][0],
            data["measures"][0],
            model,
            1);
    } else if (n == 3) {
        alert("3D visualization is not implemented in this demo yet");
    }
}

/* *****************************************************************************
 * TOOLTIP MANAGEMENT
 * ****************************************************************************/

// Create a tooltip div that is hidden by default
function createTooltip(div) {
    return div
        .append("div")
        .style("opacity", 0)
        .attr("class", "tooltip")
        .style("background-color", "#f0f0f0")
        .style("border-radius", "5px")
        .style("padding", "10px")
        .style("color", "black")
        .style("display", "inline-block")
        // .style("position", "fixed")
}

var showTooltip = function (data, d, tooltip) {
    var newd = {};
    for (const [key, value] of Object.entries(d)) {
        if (typeof(key) != "undefined" && key != "undefined" && key != "key" && key != "value") {
            newd[key] = value
        }
    }
    tooltip
        .transition()
        .duration(200)
    tooltip
        .style("opacity", 1)
        .html("<table>" + buildKeyValueTable(newd).innerHTML + "</table>")
        //.style("left", (d3.event.pageX /*+ 30*/) + "px") // d3.mouse(this)[0]
        //.style("top",  (d3.event.pageY /*+ 30*/) + "px") // d3.mouse(this)[1]
}

var moveTooltip = function (d, tooltip) {
    console.log(d3.event.pageX + " " + d3.event.pageY)
    tooltip
        .style("left", d3.mouse(this)[0] + "px")
        .style("top", d3.mouse(this)[1] + "px")
        // .style("left", (d3.event.pageX /*+ 30*/) + "px") // d3.mouse(this)[0]
        // .style("top", (d3.event.pageY  /*+ 30*/) + "px") // d3.mouse(this)[1]
}

var hideTooltip = function (d, tooltip) {
    tooltip
        .transition()
        .duration(200)
        .style("opacity", 0)
}

function appendXaxis(svg, x, height, format) {
    var axis = d3.axisBottom(x);
    if (typeof format === "undefined") {
        // axis = axis.ticks(null, "s");
    } else {
        axis = axis.tickFormat(format);
    }
    svg.append("g")
        .attr("class", "axis")
        .attr("transform", "translate(0," + height + ")")
        .call(axis)
        .selectAll("text")
        .style("text-anchor", "end")
        .attr("dx", "-.8em")
        .attr("dy", ".15em")
        .attr("transform", "rotate(-65)");
}

function appendXlabel(svg, c1, width, height) {
    svg.append("text")
        // .attr("transform", "translate(" + (width/2) + " ," + (height + margin.top + 20) + ")")
        .attr("y", height - 4)
        .attr("x", width - 2)
        .style("text-anchor", "end")
        .text(c1);
}

function appendYaxis(svg, y, x) {
    svg.append("g")
        .attr("class", "axis")
        .attr("transform", "translate(" + x(0) + ",0)")
        .call(d3.axisLeft(y).ticks(null, "s")) //.ticks(null, "s"));
}

function appendYlabel(svg, c2, width, height, x) {
    svg.append("text")
        // .attr("transform", "rotate(-90)")
        .attr("y", -5)
        .attr("x", x(0))
        .style("text-anchor", "start")
        .text(c2);
}

function appendLegend(data, svg, domain, width, height, color) {
    var legend =
        svg
            .append("g")
            .attr("font-family", "sans-serif")
            .attr("font-size", 10)
            .attr("text-anchor", "end")
            .selectAll("g")
            .data(domain.sort())
            .enter()
            .append("g")
            .attr("transform", function (d, i) {
                return "translate(" + (100 + i * 70) + "," + (height) + ")";
            });
    legend
        .append("rect")
        .attr("datapoint", "colored")
        .attr("x", width - 19)
        .attr("width", 19)
        .attr("height", 19)
        .attr("fill", function (d) {
            return color(d)
        })
        // .attr("label", function (d) {
        //     return d
        // });
    legend
        .append("text")
        .attr("x", width - 24)
        .attr("y", 10)
        .attr("dy", "0.32em")
        .text(function (d) {
            return d.replaceAll(/\d-/ig, '');
        });
}