package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    val cislo = 5
    val vysledok = when(cislo){
        1 -> "..."
        in 5..10 -> {
            "je to 5 az 10"
            println("jaro")
            15+5
        }
        else -> ""
    }

    println(vysledok)

    val vysledokIf = if(cislo < 5){
        println(cislo)
        true
    }else{
        false
    }

    println(vysledokIf)
}