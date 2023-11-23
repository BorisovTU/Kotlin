package ru.f5.lesson.classes.Second

import ru.f5.lesson.classes.intf.FirstInteface

class UseInterface(val executor: FirstInteface) {
    fun run() {
        executor.someMethodWithImplementation()
    }
}



