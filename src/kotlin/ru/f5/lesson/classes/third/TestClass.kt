package ru.f5.lesson.classes.third

import ru.f5.lesson.classes.Second.impl.FirstImpl

open class TestClass {
    private var privateField = "private Field"

    protected var protectedField = "protected field"

    internal var internalField = "internal Field"

    public var publicField = "public Field"

    open fun someMethod() {
        println(privateField)
        println(protectedField)
        println(internalField)
        println(publicField)
    }

    private fun privateTest() {
        println("test")
    }

    inner class Inner {
        fun test() {
            println(privateField)
            println(protectedField)
            println(internalField)
            println(publicField)
        }
    }

}