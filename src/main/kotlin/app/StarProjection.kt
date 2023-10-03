package app

fun displayList(array: Array<*>) {
    println("List has ${array.size} elements")
}

fun main() {
    val arrayInt : Array<Int> = arrayOf(1, 2, 3)
    val arrayString:Array<String> = arrayOf("Daud", "Hidayat", "Ramadhan")

    displayList(arrayInt)
    displayList(arrayString)
}
