package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {

    var counter =0
    while(counter < 10){
        println("counter $counter")
        counter++
    }

    var next = true
    do{
        val number = calculate()
        if(number == 0){
            next = false
        }
    }while (next)

}

fun calculate(): Int {
    return 4;
}
