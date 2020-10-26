package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    val vysledokFunkcie = Funkcie().nazovMetody(argumen1 = 20, argument2 = "Fero")
    println(vysledokFunkcie)

    nicNevraciam()

//    printMena("Jaro")
//    printMena("Jaro", "Fero")
    printMena("Jaro", "Fero", "Duro", "Evka")
//    printMena("text")

    val menaArray = arrayOf("jaro", "fero")
//    printMena(menaArray)
    printMena(*menaArray)
}

class Funkcie{

    fun nazovMetody(argumen1: Int = 15, argument2: String = "Fero")
            = "$argumen1 a $argument2"

}

fun nicNevraciam() = println("nic nevraciam")

fun printMena(vararg mena: String){
    for(m in mena){
        println(m)
    }
}