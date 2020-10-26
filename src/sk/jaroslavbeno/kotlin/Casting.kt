package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    val tomas = Osoba("Tomas", "151515/7878")
    val hocico: Any = tomas

    val osobaTomas = hocico as Osoba
    osobaTomas.meno

    hocico.meno


}