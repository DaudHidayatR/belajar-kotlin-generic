package app

import data.MyData

fun main() {
    val myData: MyData<String, Int> = MyData("Hello World", 2021)
    myData.printData()
}