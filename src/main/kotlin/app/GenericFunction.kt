package app

import data.Function

fun main() {
    val function = Function("Kotlin")

    function.sayHello<String>("Kotlin")
    function.sayHello("Daud")

    function.sayHello<Int>(2021)
    function.sayHello(2020)
}