package ru.f5.lesson.classes.Second

import ru.f5.lesson.classes.Second.intf.FirstInteface

class UseInterface(val executor: FirstInteface) {
    fun run() {
        executor.someMethodWithImplementation()
    }
}



