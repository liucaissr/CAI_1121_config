 
listView('CAI_1121 Jobs') {
    description('CAI_1121 Jobs')
    jobs {
        regex('CAI_1121_.+')
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
