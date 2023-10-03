package app

class Covariant<out T>(val data:T) {
    fun data(): T {
        return data
    }
}
fun main() {
    val covariantString = Covariant("Hello")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantAny.data())
}