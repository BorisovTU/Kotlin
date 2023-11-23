package ru.f5.lesson.classes.intf
interface FirstInteface {
    var field: String
    fun someMethod()

    fun someMethodWithImplementation() {
        println("Hello DEFAULT")
    }
}