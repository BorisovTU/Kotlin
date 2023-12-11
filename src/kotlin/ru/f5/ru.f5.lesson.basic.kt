package ru.f5
fun main() {
    workWithArray()
}


fun workWithArray() {
    var arr = arrayOf("","","")
    for (str in arr) {
        println(str)
    }

    var twoDimentialArray = Array(3) { arrayOf("","","") }
    twoDimentialArray[0] = arrayOf("level 1-1","level 1-2", "level 1-3", "level 1-4")
    twoDimentialArray[1] = arrayOf("level 2-1","level 2-2", "level 2-3", "level 2-4")

    // так как
    // twoDimentialArray[2] = arrayOf(1,2,3,4,5,6,7,8,9,0)
    println(twoDimentialArray.contentDeepToString())
}