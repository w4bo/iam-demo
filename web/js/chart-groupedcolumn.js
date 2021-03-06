function drawGroupedColumn(id, prop, data, d1, d2, c, mode, selectedModel, selectedComponent, highlightColor) {
    var rawData = data["raw"]
    var X = rawData.map(function(d) { return d[d1]; });
    var M = rawData.map(function(d) { return d[c]; });

    var miny = 0, maxy = 0;
    var X = [], M = new Set(), C = [];
    let count = 0
    for (var d in rawData) {
        count += 1
        d = rawData[d];
        miny = Math.min(miny, d[d2]);
        maxy = Math.max(maxy, d[d2]);
        X.push(d[d1]);
        M.add(d[c]);
    }
    M = Array.from(M);

    // set the dimensions and margins of the graph
    var margin = prop.margin, width = prop.width, height = prop.height;
    width = Math.max(width, count * 10);
    var div = d3.select("#" + id).append("div");
    var svg = div
                .append("svg")
                    .attr("width", width + margin.left + margin.right)
                    .attr("height", height + margin.top + margin.bottom)
                .append("g")
                    .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

    var x0 = d3.scaleBand().rangeRound([0, width]).paddingInner(0.1);
    var x1 = d3.scaleBand().padding(0.05);
    var y = d3.scaleLinear().rangeRound([height, 0]);
    var z = d3.scaleOrdinal().domain(M).range(c); // greyPalette()

    x0.domain(X);
    x1.domain(M).rangeRound([0, x0.bandwidth()]);
    y.domain([miny, maxy]).nice();
    var tooltip = createTooltip(div);
    svg.append("g")
        .selectAll("g")
        .data(rawData)
        .enter()
        .append("g")
            .attr("transform", function(d) { return "translate(" + x0(d[d1]) + ",0)"; })
            .selectAll("rect")
            .data(function(d) { return M.map(function(key) {
                var newd = JSON.parse(JSON.stringify(d));
                if (newd[c] == key) { newd["key"] = key; newd["value"] = d[d2] }
                else                { newd["key"] = key; newd["value"] = undefined }
                return newd;
            })})
            .enter()
            .append("rect")
                .attr("x", function(d) { if (mode == 1) return x1(M[M.length / 2 + M.length % 2 - 1]); else return x1(d.key); })
                .attr("y", function(d) { return y(d.value); })
                .attr("datapoint", function(d) { if (mode == 1) return "colored"; else return "component"; })
                .attr("width", x1.bandwidth())
                .attr("height", function(d) { return height - y(d.value); })
                .attr("fill", function(d) {
                    if (d[selectedModel] == selectedComponent) { return highlightColor; }
                    else return z(d.key);
                })
                .on("mouseover",  function f (d) { showTooltip(data, d, tooltip) })
                .on("mousemove",  function f (d) { moveTooltip(d, tooltip) })
                .on("mouseleave", function f (d) { hideTooltip(d, tooltip) });

    appendXaxis(svg, x0, height);
    appendXlabel(svg, d1, width, height);
    appendYaxis(svg, y, x0);
    appendYlabel(svg, d2, width, height, x0);
    return [height, width];
}