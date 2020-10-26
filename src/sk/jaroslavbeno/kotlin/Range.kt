package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    val i = 1050

//    if(i in 1..5000){  // i>=1 && i<=5000
//        println(i)
//    }
//
//    for(i in 5..10){
//        println(i)
//    }
//
//    for (i in 10 downTo 5){
//        println(i)
//    }

//    for(i in 1..5000 step 50){
//        println(i)
//    }

    for(i in 5 until 10){
        println(i)
    }

    for (i in 10 downTo 5 step 2){
        println(i)
    }

}