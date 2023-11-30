package ru.f5.lesson.classes.third

import ru.f5.lesson.classes.first.fields.TestClass

fun main() {
//    var otherClass = OtherClass()
//    var testClass = TestClass()
//    testClass.test()
//    println(testClass.name)

    var dataClass = DataClass("Tima", secondName = "Borisov", "Uuuu")
    var dataClass2 = DataClass("Tima", secondName = "Borisov", "Uuuu")

    var dataCopy = dataClass.copy(firstName = "Yan")
    println("dataclass = ${dataClass}, dataCopy = ${dataCopy} ")
    println(dataClass.equals(dataClass2))
}