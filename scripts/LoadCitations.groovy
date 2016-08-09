config create_schema: false
config load_threads: 3
config load_new: false

inputfiledir = '/Users/twilmes/work/repos/pindex-example/data/'
citations = File.csv(inputfiledir + "citations.csv").delimiter(',')


load(citations).asEdges {
label "cites"
    outV "aPaperId", {
        label "paper"
        key "paperId"
    }
    inV "bPaperId", {
        label "paper"
        key "paperId"
    }
}
