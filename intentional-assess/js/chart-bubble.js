function drawBubble(id, prop, data, c1, c2, c3, c4, mode) {

    // set the dimensions and margins of the graph
    let margin = prop.margin, width = prop.width, height = prop.height;
    let rawData = data["raw"]
    let minx = 0, maxx = 0, miny = 0, maxy = 0, minr = Number.MAX_SAFE_INTEGER, maxr = Number.MIN_SAFE_INTEGER;
    let domain = new Set();
    let distinctc2 = new Set();
    rawData.forEach(function(d) {
        if (mode > 1) {
            minx = Math.min(minx, d[c1]);
            maxx = Math.max(maxx, d[c1]);
            miny = Math.min(miny, d[c2]);
            maxy = Math.max(maxy, d[c2]);
        }
        minr = Math.min(minr, d[c3]);
        maxr = Math.max(maxr, d[c3]);
        domain.add(d[c4]);
        distinctc2.add(d[c2]);
    });
    let count = distinctc2.size
    domain = Array.from(domain);
    height = Math.max(400 - prop["margin"]["top"] - prop["margin"]["bottom"], count * 10);
    var div = d3.select("#" + id).append("div");
    
    var svg = div
                .append("svg")
                    .attr("width", width + margin.left + margin.right)
                    .attr("height", height + margin.top + margin.bottom)
                .append("g")
                    .attr("transform", "translate(" + margin.left + "," + margin.top + ")");
    var x;
    var y;
    // Add X axis
    if (mode > 1) {
        x = d3.scaleLinear()
            .domain([minx, maxx])
            .range([0, width]);

        y = d3.scaleLinear()
            .domain([miny, maxy])
            .range([height, 0]);
    } else {
        x = d3
            .scalePoint()
            //.scaleBand()
            .rangeRound([0, width])
            .padding(0.1)
            .domain(rawData.map(function (d) {
                return d[c1];
            }))

        y = d3
            .scalePoint()
            // .scaleBand()
            .rangeRound([0, height])
            .padding(0.1)
            .domain(rawData.map(function (d) {
                return d[c2];
            }))
    }

    // Add a scale for bubble size
    var z = d3
        .scaleLinear()
        .range([2.5, 10])
        .domain([minr, maxr]);

    var tooltip = createTooltip(div);
    svg.append('g')
        .selectAll("dot")
        .data(rawData)
        .enter()
        .append("circle")
            .attr("transform", "translate(" + x(0) + "," + y(0) + ")")
            .attr("cx", function (d) { return x(d[c1]); } )
            .attr("cy", function (d) { return y(d[c2]); } )
            .attr("datapoint", "negcolored")
            .attr("r", function (d) {  if (mode == 2 && c3 == "undefined") return 4; else return z(d[c3]); })
            .on("mouseover",  function f (d) { showTooltip(data, d, tooltip) })
            .on("mousemove",  function f (d) { moveTooltip(d, tooltip) })
            .on("mouseleave", function f (d) { hideTooltip(d, tooltip) });

    appendXaxis(svg, x, height);
    appendXlabel(svg, c1, width, height);
    appendYaxis(svg, y, x);
    appendYlabel(svg, c2, width, height, x);
    // appendLegend(data, svg, domain, 20, -40, color);
}