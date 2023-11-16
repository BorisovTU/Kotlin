package ru.f5.lesson.classes.first.open

class ChildWithParentVoid : Parent() {
    override fun openPrint() {
        super.openPrint()
        println("openPrint: Печать из дочернего класса - ChildWithParentVoid")
    }
}