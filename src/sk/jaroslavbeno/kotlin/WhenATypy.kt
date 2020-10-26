package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    val nieco = arrayListOf("Jaro", "Peter", 10)

    for (n in nieco){
        println("${
            when(n){
                is Int -> n*5
                is String -> n.toUpperCase()
                else -> ""
            }
        }")
    }
}