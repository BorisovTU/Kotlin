package ru.f5.lesson.classes.Second.intf

interface SamInterface {
    fun apply(): Unit

    fun test() {
        println("hello from interface")
        apply()
        println("goodbuy from interface")
    }

}