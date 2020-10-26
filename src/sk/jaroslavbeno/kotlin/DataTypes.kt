package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    val vysledok: Any = JavaKod.sum(10, 15)

    val nic = JavaKod.nic()
    print(nic)
}

fun nic2(): Unit{
    print("nic 2")
}