package ru.f5.lesson.classes.first.open

class Child: Parent() {
    override fun openPrint() {
        println("openPrint: Печать из дочернего класса")
    }

    fun childPrint() {
        println("ChildPrint")
    }
//    Так нельзя так как при переписывании надо явно ставить модификатор override
//    fun openPrint() {
//        println("openPrint: Печать из дочернего класса")
//    }

//    не работает так как fun print() у Parent() не open
//    override fun print() {
//    }

}