package ru.f5.lesson.classes.Second

import ru.f5.lesson.classes.Second.intf.SamInterface

fun main() {
//    val executor = SecondImpl()
//    var first: UseInterface = UseInterface(executor)
//    first.run()

//    val executor = UseMultipleInterface()
//    executor.run()

    // пример реализации через Lambda
//    var lambda:FunctionalInterface = FunctionalInterface { println("hello from lambda") }

    // пример реализации SAM интерфейса через анонимный класс
    var samInterface: SamInterface = object : SamInterface {
        override fun apply() {
            println("hi")
        }

        override fun test() {
            super.test()
            println("END")
        }
    }
    samInterface.test()
}