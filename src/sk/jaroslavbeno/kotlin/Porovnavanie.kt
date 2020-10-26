package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {

    // ==
    // ===

    var jaro = Osoba("Jaro Beno", "154878/7529")
    var jaro2 = Osoba("Jaro Beno", "154878/7529")
    var peter = Osoba("Peter Beno", "154548/1545")

//    println(jaro == peter)
//    println(jaro === peter)
//
//    println(jaro != jaro2) //false
//    println(jaro !== jaro2) //true

    val meno = "jaro"
    val meno2 = "jaro"

    println(meno == meno2)  //true
    println(meno === meno2)  //false
}