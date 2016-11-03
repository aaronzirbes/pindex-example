config create_schema: false
config load_new: true

inputfiledir = '/Users/twilmes/work/repos/pindex-example/data/'
paperInput = File.csv(inputfiledir + "papers.csv").delimiter(',')
authorInput = File.csv(inputfiledir + "authors.csv").delimiter(',')
//citations = File.csv(inputfiledir + "citations.csv").delimiter(',')
authorPaperInput = File.csv(inputfiledir + "authors_papers.csv").delimiter(',')

load(paperInput).asVertices {
    label "paper"
    key "paperId"
}

load(authorInput).asVertices {
    label "author"
    key "authorId"
}

load(authorPaperInput).asEdges {
label "wrote"
    outV "authorId", {
        label "author"
        key "authorId"
    }
    inV "paperId", {
        label "paper"
        key "paperId"
    }
}

/*load(citations).asEdges {
label "cites"
    outV "aPaperId", {
        label "paper"
        key "paperId"
    }
    inV "bPaperId", {
        label "paper"
        key "paperId"
    }
}*/

