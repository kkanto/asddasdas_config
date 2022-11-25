 
listView('asddasdas Jobs') {
    description('asddasdas Jobs')
    jobs {
        regex('asddasdas_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
