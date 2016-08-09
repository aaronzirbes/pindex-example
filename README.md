```groovy
system.graph('papers').create()
:remote config alias g papers.g
:load /your/path/to/pindex-example/schema.groovy
```

Open `LoadAuthors.groovy` and `LoadCitations.groovy` and update the `inputfiledir`. Then from the dse-graph-loader directory run:

`./graphloader /your/path/to/pindex-example/scripts/LoadAuthors.groovy -graph papers`

`./graphloader /your/path/to/pindex-example/scripts/LoadCitations.groovy -graph papers`
