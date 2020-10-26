package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {

    val mena = arrayListOf<String>("Jaro", "Peter")

    mena@for ((i, v) in mena.withIndex()) {
        println("$i $v ")
        for (j in 0..4){
            println(j)
            if(j >2){
                break@mena
            }
        }
    }

}