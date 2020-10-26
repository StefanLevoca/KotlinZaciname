package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    // String text = null
    // text.legnth

    val text: String? = Daco.vratString()

    println(text!!.toUpperCase())

    val text2: String? = "jaro"
    text2?.let { printIt(it) }

//    printIt(text2!!)
}

fun printIt(textNaVypis: String){
    println(textNaVypis)
}