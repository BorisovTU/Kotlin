package ru.f5.lesson.classes.first.sealed

sealed class ParentSealed {
    abstract fun test()

    fun run() {
        println("Run")
        test()
        println("Finish")
    }
}