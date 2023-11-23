package ru.f5.lesson.classes.intf

interface SamInterface {
    fun apply(): Unit

    fun test() {
        println("hello from interface")
        apply()
        println("goodbuy from interface")
    }

}