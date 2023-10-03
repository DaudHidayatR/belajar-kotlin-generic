package app

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val data = TypeErasure("Adit")
    val name: String = data.getData()
    println(name)

//error konversi
    val data2 : TypeErasure<Int> = data as TypeErasure<Int>
    val number: Int = data2.getData()
    println(number)
}