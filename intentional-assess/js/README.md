# Assess (web)

## TODO

Visual charts
- [x] Tooltip
- [x] Legend with color gradient
- [ ] Text highlight
- [x] Barchart (sorted) vs column
    - [ ] Use small multiples in a single card

Comparison
- [x] Add ratio

Details on demand (dual to our approach):
- [ ] Fix k-medoid with k=1
- [ ] Take automatic decision for all the subprolems (probably with global labeling)
- [ ] Then, prograssively disaggregate it

Clustering:
- [ ] Density based clustering (DBSCAN) vs k-medoid (but we need to keep k small)
- [ ] Agglomerative hierarchical clustering (siluette)
    - [ ] Use the dendrogram to clusters
- [ ] But, if we drop k, how do we evaluate which is the best solution?
- [ ] Find clustering based on data distribution

Questions:
- [ ] Do you like progressive refinement?
- [ ] Do you prefer a single solution and the go back to the detail?

Cubes:
- [ ] IPUMS (has no addictive meaures)

Labeling:
- Book: who is number one?
  - https://www.semanticscholar.org/paper/Who%27s-%231-the-Science-of-Rating-and-Ranking-Stickles/ca15228071a2d4502c5b593a25b43bc5152edcb9
  - https://www.semanticscholar.org/paper/Understanding-draws-in-Elo-rating-algorithm-Szczecinski-Djebbi/a8f5eb166246294bf1a826c2902f0bd7e2f77f68
- Some global labeling
- Median voter
- Equiwidth bucket

Side notes:
- Add the describe query?