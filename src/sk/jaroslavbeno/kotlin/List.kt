package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    val mena = arrayListOf<String>("Jaro", "Peter")
    printList(mena)
    mena.add("Fero")
    printList(mena)
    mena.add(1,"Jakub")
    printList(mena)

    mena.remove("Jakub")
    printList(mena)

    mena.removeAt(0)
    printList(mena)


    val mena2 = listOf<String>("Jaro", "Peter")

    val mena3 = mena + mena2
    printList(mena3)
}

fun printList(mena: List<String>) {
    for (m in mena){
        println(m)
    }
    println(".......................")
}