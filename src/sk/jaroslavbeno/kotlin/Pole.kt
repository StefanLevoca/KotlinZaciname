package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    val mena = arrayOf("Jaro", "Peter", "Jakub")
    val mena2 = arrayOf("Jaro", "Peter", "Jakub")
    val rozne = arrayOf("Jaro", 10, Osoba("Tomas", "145878/8787"), false, "Peter");

    val intCisla = intArrayOf(10,10)
    val doubleCisla = doubleArrayOf(10.0,10.1)
    val floatCisla = floatArrayOf(15.0f, 45.0f)


    println(mena[0])
    println(mena[2])
    mena[0] = "Fero"
    println(mena[0])

    val spoluMena = mena + mena2
    println(spoluMena.size)
    spoluMena.set(0,"Jaro")

    for(m in mena){
        println(m)
    }

    val pole = Array<Long>(10){ i -> (i*2).toLong() }
    for (j in pole)
        println(j)

    val menaArray = Array(5) { i -> "jaro"}
    for (j in menaArray)
        println(j)

    val nullIntPole = arrayOfNulls<Int?>(5)


}