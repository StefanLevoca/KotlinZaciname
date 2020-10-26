package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    //0 ........ 10

//    val i = 5
//
//    for (n in 10..15){
//        println(n*5)
//    }
//
    val mena = arrayListOf<String>("Jaro", "Peter")
//    for(m in mena){
//        println(m.toUpperCase())
//    }

    for((i, h) in mena.withIndex()){
        println("i $i \$h ${4+5}")
    }


}