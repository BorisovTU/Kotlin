package ru.f5.lesson.classes.first.open
open class Parent {
    open fun openPrint(){
        println("openPrint: Печать из родителя")
    }

    fun print(){
        println("print: Печать из родителя")
    }
}