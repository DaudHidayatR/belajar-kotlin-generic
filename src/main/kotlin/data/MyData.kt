package data

class MyData<T,U> (val firstData: T, val secondData: U) {
    fun getData(): T {
        return firstData
    }
    fun getSecond(): U {
        return secondData
    }
    fun printData() {
        println(firstData)
        println(secondData)
    }
}