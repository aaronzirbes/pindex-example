random = new Random(1)
getRandAge = {
    20 + random.nextInt(30)
}

getRandYear = {
    2000 + random.nextInt(15)
}

authors = g.V().hasLabel('author').toList()
authors.each{
    author ->
        author.property('age', getRandAge())
}

papers = g.V().hasLabel('paper').toList()
papers.each {
    paper ->
        paper.property('year', getRandYear())
}

