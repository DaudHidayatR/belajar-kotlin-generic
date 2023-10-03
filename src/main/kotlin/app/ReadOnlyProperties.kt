package app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ReadOnlyProperties(val name: String, val age: Int) : ReadOnlyProperty<Any, String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("accessing ${property.name} with value $name")
        println("accessing ${property.name} With value $age")
        return name.toUpperCase()
    }
}
class NameWithLog(param: String){
    val name: String by ReadOnlyProperties(param, 10)
}

fun main() {
    val nameWithLog = NameWithLog("daud")
    println(nameWithLog.name)
    println(nameWithLog.name)
}