package sk.jaroslavbeno.kotlin

import java.lang.StringBuilder

fun main(args: Array<String>) {
    val text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eu tempus magna."
        .toLowerUpper()
    println(text)
}

fun String.toLowerUpper(): String{
    val finalString = StringBuilder()

    for(i in 0 until this.length){
        if(i % 2 == 0){
            finalString.append(this.toLowerCase()[i])
        }else{
            finalString.append(this.toUpperCase()[i])
        }
    }

    return finalString.toString()
}