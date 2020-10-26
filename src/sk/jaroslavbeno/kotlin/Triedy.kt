package sk.jaroslavbeno.kotlin


val KONSTANTA = 150
var premenna = "Jaro"


fun main(args: Array<String>) {
    val auticko = Auto("Skoda")
    val auto = Auto("Skoda", 10)

    auto.nazov
    auto.pocetDveri
    auto.pocetDveri = 100
    premenna
}

class Auto (val nazov: String, pocetDveri: Int = 4){
    var pocetDveri = pocetDveri
    get() {
        println("volam vlastny get pre pocet dveri")
        return field
    }
    set(value) {
        println("volam vlsastnu set pre pocet dveri")
        field = value
    }
}

class Skuska() {
    val daco: Int;

    init {
        this.daco = 4
    }
}
