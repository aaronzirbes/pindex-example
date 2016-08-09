```groovy
system.graph('papers').create()
:remote config alias g papers.g
:load /your/path/to/pindex-example/scripts/schema.groovy
```

Open `LoadPapers.groovy` and `LoadCitations.groovy` and update the `inputfiledir`. Then from the dse-graph-loader directory run:

`./graphloader /your/path/to/pindex-example/scripts/LoadPapers.groovy -graph papers`

`./graphloader /your/path/to/pindex-example/scripts/LoadCitations.groovy -graph papers`

See [here](https://github.com/upulcranga/pindex) for the original data set.
