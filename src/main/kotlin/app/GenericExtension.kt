package app

class Data<T>(val data: T)

fun Data<String>.print() {
    println("Data: ${this.data}")
}
fun main() {
    val data1 = Data("Adit")
    val data2 = Data(100)

    data1.print()
//    error
//    data2.print()
}

