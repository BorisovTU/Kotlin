import ru.f5.lesson.classes.first.fields.TestClass
import ru.f5.lesson.classes.first.open.Child
import ru.f5.lesson.classes.first.open.ChildWithParentVoid
import ru.f5.lesson.classes.first.open.Parent
import ru.f5.lesson.classes.first.sealed.ChildSealed
import ru.f5.lesson.classes.first.sealed.NotSealedAbstract
import ru.f5.lesson.classes.first.sealed.NotSealedChild
import ru.f5.lesson.classes.first.sealed.ParentSealed
import ru.f5.lesson.classes.first.sealed.NotSealedAbstract as NotSealedAbstract1

fun main() {
//    openTest()
//    sealedTest()
gettterSetterTest()

}

fun gettterSetterTest() {
    var runner = TestClass("Lalala")
    // вызывается setSimpleField("New Value")
    runner.simpleField = "New Value"
    // вызывается getSimpleField()
    println(runner.simpleField)
}

// Нельзя так как ParentSealed находится в другом пакете и он sealed
//class TestClass: ParentSealed() {
//}

fun sealedTest() {
    var child: ParentSealed = ChildSealed()
    child.run()

//   так можно - это создание анонимного класса из обычного абстрактного класса
//    var anonym: NotSealedAbstract = object : NotSealedAbstract() {
//        override fun test() {
//            TODO("Not yet implemented")
//        }
//    }


//   так нельза так как sealed
//    var anonym2 = object : ParentSealed() {
//        override fun test() {
//            TODO("Not yet implemented")
//        }
//    }

    when (child) {
        is ChildSealed -> print("Yahoo")
    }

    val childOfNotSealed:NotSealedAbstract = NotSealedChild()

    extracted(childOfNotSealed)
}

fun extracted(childOfNotSealed: NotSealedAbstract) {
    when (childOfNotSealed) {
        is NotSealedChild -> print("Yahoo")
        else -> print("HAHAHA")
    }
}

private fun openTest() {
    var child: Parent = Child()
    var childWith: Parent = ChildWithParentVoid()
    child.openPrint()
    childWith.openPrint()
}

