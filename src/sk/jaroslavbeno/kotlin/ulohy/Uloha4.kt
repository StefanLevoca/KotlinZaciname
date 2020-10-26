package sk.jaroslavbeno.kotlin.ulohy

fun rovnica(a: Int, b: Int): Int{
    return a + (b + 100) * 78 - 24
}

fun main(args: Array<String>) {
    println(rovnica(150,4))
}