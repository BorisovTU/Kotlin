package ru.f5.lesson.classes.third

class TestChildClass: TestClass() {

    override fun someMethod() {
        // не видит
//        println(privateField)
        println(protectedField)
        println(internalField)
        println(publicField)
    }
}