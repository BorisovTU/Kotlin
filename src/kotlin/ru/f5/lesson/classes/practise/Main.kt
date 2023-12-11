package ru.f5.lesson.classes.practise

import java.lang.RuntimeException

fun main() {
    println("Выбор 1")
    println("Выбор 2")
    println("Выбор 3")
    println("Выбор 4")


    val choiceOne = fun() {
        printEmpty()
        println("Выбор 11")
        println("Выбор 12")
        println("Выбор 13")
        println("Веронуться")

    }
    val choiceTwo = fun() {
        printEmpty()
        println("Выбор 21")
        println("Выбор 22")
        println("Выбор 23")
        println("Вернуться")
    }
    val choiceThree = fun() {
        printEmpty()
        println("Выбор 31")
        println("Выбор 32")
        println("Выбор 33")
        println("Вернуться")
    }

    val choiceFour = fun() {
        printEmpty()
        println("Выбор 41")
        println("Выбор 42")
        println("Выбор 43")
        println("Вернуться")
    }
    val mainMenu = when (readln()) {
        "1" -> choiceOne.invoke()
        "2" -> choiceTwo.invoke()
        "3" -> choiceThree.invoke()
        "4" -> choiceFour.invoke()
        else -> throw RuntimeException("Некорректная комманда")
    }
}

fun printEmpty() {
    for (i in 0..20) {
        println()
    }
}