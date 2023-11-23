package ru.f5.lesson.classes.impl

import ru.f5.lesson.classes.intf.FirstInteface

class SecondImpl: FirstInteface {
    override var field: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun someMethod() {
        TODO("Not yet implemented")
    }

    override fun someMethodWithImplementation() {
        println("Second implementation")
    }

}