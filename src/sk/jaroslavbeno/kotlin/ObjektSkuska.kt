package sk.jaroslavbeno.kotlin

object TotoJeSingleton{
    val premenna = 45
    fun funckiaSingleton() = printIt("jaro");
}



fun main(args: Array<String>) {
   TotoJeSingleton.funckiaSingleton()

}