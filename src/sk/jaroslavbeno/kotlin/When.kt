package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    val vstup="SEVER"

    if (vstup == "SEVER"){
        println("iden hore")
    }else if(vstup == "JUH"){
        println("iden dole")
    }else if(vstup == "ZAPAD"){
        println("iden dolava")
    }else if(vstup == "VYCHOD"){
        println("iden doprava")
    }else {
        println("neznamy smer")
    }

    when(vstup){
        "SEVER" -> println("iden hore")
        "JUH" -> {
            println("iden dole")
            10+10
            println()
            //....
        }
        "ZAPAD" -> println("iden dolava")
        "VYCHOD" -> println("iden doprava")
        (10+5).toString() -> println("iden doprava")
        else -> println("neznamy smer")
    }

    val cislo = 5
    when(cislo){
        1 -> println("...")
        in 5..10 -> println(" je to 5 az 10")
    }

}