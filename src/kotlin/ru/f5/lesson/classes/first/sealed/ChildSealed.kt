package ru.f5.lesson.classes.first.sealed

class ChildSealed: ParentSealed() {
    override fun test() {
        println("Одна из единственных реализаций")
    }
}