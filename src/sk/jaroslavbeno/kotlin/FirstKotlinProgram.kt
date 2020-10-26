package sk.jaroslavbeno.kotlin

typealias SuperSpicaOsoba = Osoba
typealias Osoby = List<Osoba>

fun main(args: Array<String>) {

    var osobaJaro = Osoba("Jaro Beno", "154878/7529")
    Osoba.vseobecnaFunkcia()

    println(osobaJaro.meno)
    osobaJaro.meno = "Peter"
    println(osobaJaro.meno)

    println(osobaJaro.rodCislo)

    osobaJaro = SuperSpicaOsoba("Peter", "145848/1299")

    val osoby: List<Osoba>
    val osoby2: Osoby



}

fun skuska(x: Long){
    println("cislo> "+ x)
}

class Osoba(var meno: String, val rodCislo: String){
    companion object {
        fun vseobecnaFunkcia() = println("toto je vseobecna funkcia")
    }

//
//    override fun equals(other: Any?): Boolean {
//        if(other is Osoba){
//            return rodCislo == other.rodCislo  //
//        }else{
//            return false
//        }
//    }
}