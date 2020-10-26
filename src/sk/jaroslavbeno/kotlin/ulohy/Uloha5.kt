package sk.jaroslavbeno.kotlin.ulohy

fun main(args: Array<String>) {
    val cislo = -50
    if(cislo > -1)
        println("cislo je pozitivne")
    else
        println("cislo je negativne")
    //------------------------------

    var pocetVajec = 0
    val jeObchodOtvoreny = true
    if (pocetVajec > 0){
        //varime
        println("varime omeletu")
    }else{
        //idem nakupit
        if(jeObchodOtvoreny){
            println("Kupim 4 vajcia")
            println("varim")
            pocetVajec = 4
        }else{
            println("nejdem varit nemam vajka")
        }
    }
    //------------------------------

    val cisloDna = 1
    if(cisloDna == 1){
        println("je Pondelok")
    }else if(cisloDna == 2){
        println("je Utorok")
    }else if(cisloDna == 3){
        println("je Streda")
    }else if(cisloDna == 4){
        println("je Stvrtok")
    }else if(cisloDna == 5){
        println("je Piatok")
    }else if(cisloDna == 6){
        println("je Sobota")
    }else if(cisloDna == 7){
        println("je Nedela")
    }
    //------------------------------

    val cislo1 = 0
    val cislo2 = 40
    val cislo3 = -10
    var max = cislo1
    if(cislo2 > max){
        max = cislo2
    }else if(cislo3 > max){
        max = cislo3
    }
    println("max je $max")
    //------------------------------

    var min = cislo1
    if(cislo2 < min ){
        min = cislo2
    }else if(cislo3 < min){
        min = cislo3
    }

    var stred: Int = 0
    if(min != cislo1 && max != cislo1)
        stred = cislo1
    if(min != cislo2 && max != cislo2)
        stred = cislo2
    if(min != cislo3 && max != cislo3)
        stred = cislo3

    println("min: $min, stred: $stred, max: $max")
}