package ru.f5.lesson.classes.Second

import ru.f5.lesson.classes.impl.FirstImpl
import ru.f5.lesson.classes.impl.SecondImpl
import ru.f5.lesson.classes.intf.SamInterface

fun main() {
//    val executor = SecondImpl()
//    var first: UseInterface = UseInterface(executor)
//    first.run()

//    val executor = UseMultipleInterface()
//    executor.run()

    val sam: SamInterface = object: SamInterface {
        override fun apply() {
            println("apply")
        }
    }

    sam.test()
}