package ru.f5.lesson.classes.intf
interface SecondInteface {
    var field: String
    fun someMethod()

    fun someMethodWithImplementation() {
        println("Hello Second DEFAULT")
    }
}