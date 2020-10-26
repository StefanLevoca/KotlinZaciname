package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    val stol: Nabytok = Stol(5)
    val skrina: Skrina = Skrina(true)

    stol.printDaco()

}

abstract class Nabytok{
   abstract fun printDaco()
}

class Stol(val pocetSuflikov: Int)
    : Nabytok(){
    override fun printDaco() = println("printDaco Stol")
}

class Skrina(val presklena: Boolean)
    : Nabytok(){
    override fun printDaco() = println("printDaco Skrina")
}