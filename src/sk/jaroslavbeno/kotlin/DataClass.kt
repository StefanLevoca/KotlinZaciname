package sk.jaroslavbeno.kotlin

data class Car (val nazov: String, val pocetDveri: Int = 4){

}

fun main(args: Array<String>) {
    val auto = Car("Skoda", 5)
    val auto2 = Car("Skoda", 5)

//    println(auto == auto2)
//    println(auto === auto2)

    val auto3 = auto.copy(pocetDveri = 4)

    println(auto == auto3)
    println(auto === auto3)
}