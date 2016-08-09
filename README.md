```groovy
system.graph('papers').create()
:remote config alias g papers.g
:load /your/path/to/pindex-example/scripts/schema.groovy
```

Open `LoadPapers.groovy` and `LoadCitations.groovy` and update the `inputfiledir`. Then from the dse-graph-loader directory run:

`./graphloader /your/path/to/pindex-example/scripts/LoadPapers.groovy -graph papers`

`./graphloader /your/path/to/pindex-example/scripts/LoadCitations.groovy -graph papers`

See [here](https://github.com/upulcranga/pindex) for the original data set and [here](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0134794) for the PageRank-Index paper that references it.
