package ru.f5.lesson.classes.third

public val TestClass.name: String
    get() {return "Tom"}

class OtherClass {
    fun test() {
        var testClass: TestClass = TestClass()
//       не видит
//        println(testClass.privateField)
//        println(testClass.protectedField)
        println(testClass.internalField)
        println(testClass.publicField)

        testClass.test()

    }
}

public fun TestClass.test() {
    println("some function")
}
