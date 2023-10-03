package app

class Invariant<T>( val value: T)

fun main() {
    val invariantString = Invariant("Hello")
//    error
//    val invariantAny = Invariant<Any> = invariantString
//
//    invariantAny.data = 1000
}