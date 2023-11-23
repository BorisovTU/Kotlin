package ru.f5.lesson.classes.Second

import ru.f5.lesson.classes.intf.FirstInteface
import ru.f5.lesson.classes.intf.SecondInteface

class UseMultipleInterface: FirstInteface, SecondInteface {
    fun run() {
        someMethodWithImplementation()
    }

    override var field: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun someMethod() {
        TODO("Not yet implemented")
    }

    override fun someMethodWithImplementation() {
        println("My realisation()")
        super<FirstInteface>.someMethodWithImplementation()
        super<SecondInteface>.someMethodWithImplementation()
    }
}



