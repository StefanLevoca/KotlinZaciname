package sk.jaroslavbeno.kotlin.ulohy

fun main(args: Array<String>) {
    var i = 1
    while (i != 11){
        println(i)
        i++
    }

    println("----------------")
    i=1
    while (i != 101){
        if (i % 2 == 0){
            println(i)
        }
        i++
    }
    println("----------------")
    i=1
    while (i != 101){
        if (i % 5 == 0){
            println(i)
        }
        i++
    }
    println("----------------")
    i = 1
    var sumParne = 0
    var sumeNeparne = 0
    while (i != 11){
        if(i % 2 == 0){
            sumParne += i
        }else{
            sumeNeparne += i
        }
        i++
    }
    println("suma parne: $sumParne \nsuma neparne: $sumeNeparne")

    println("----------------")
    var pocetVajec = 4
    var jeObchodOtvoreny = false
    if (pocetVajec > 0){
        //varime
        var pocetRozbitych = 0
        while (pocetRozbitych != pocetVajec){
            println("rozbil som vajko")
            pocetRozbitych++
        }
        println("varime omeletu")
    }else{
        //idem nakupit
        while(!jeObchodOtvoreny){
            println("cakam kym otvoria")
            jeObchodOtvoreny = true
        }
        println("Kupim 4 vajcia")
        println("varim")
        pocetVajec = 4
    }

}