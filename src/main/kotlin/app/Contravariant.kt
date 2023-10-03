package app

class Contravariant <in T> {
    fun sayHello(param: T){
        println("Hello $param")
    }
//    tidak boleh
//    fun getData(): T {
//        return data
//    }
}

fun main() {
    val contravariantString = Contravariant<String>()
    val contravariantAny: Contravariant<String> = contravariantString

//    contravariantString.getData() // error
    contravariantAny.sayHello("daud")
}