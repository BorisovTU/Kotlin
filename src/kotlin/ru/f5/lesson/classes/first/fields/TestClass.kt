package ru.f5.lesson.classes.first.fields

class TestClass(private val name: String) {
    var simpleField: String? = name
        get() = "prefix ${name} ${field}"
        set(value)  {
            println("попытка присвоить ${value}. Текущее значение - ${field}")
            field = value
     // приведет к бесконечному циклу и stackOverflowError так как постоянно будет вызывать setSimpleField
//            simpleField = value
        }


}