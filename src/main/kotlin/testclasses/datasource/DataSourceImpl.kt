package testclasses.datasource

import testclasses.datasource.DataSource
import java.util.*

class DataSourceImpl : DataSource {

    private var uuid: UUID = UUID.randomUUID()

    override fun printSomething() {
        println("Random UUID: ${uuid}")
    }
}