package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {

    val number = 15

    if(number > 10){
        println("number > 10")
    }else if(number < 10){
        println("number < 10")
    }else{
        println("number == 10")
    }

    if(!isNumber()){
        //false
    }else{
        //true
    }

    if(10 <= 100)
        println()
    else
        println()
    println()

    val isNumberTrue = true
    if(!isNumberTrue){
        //true
    }

    if("jaro".isEmpty()){
        //true
    }

    if( (10+100) != 110){

    }
/*
    == rovnosť   		ľavá strana so rovná pravej
    != nerovnosť		ľavá strana sa nerovná pravej
    && logický súčin		platí ľavá aj pravá strana AND – a zároveň
    || logický súčet		platí ľavá alebo pravá strana OR
    < menší			ľavá strana je menšia ako pravá
    > väčší
    <=
    >=

 */

    if( true && true){
        //
    }

    if( false || false){
        // ....
    }

    val name = "jaro"

    if (
        (!isNumber() || number > 100) &&
        ("Jaro".isEmpty() && "Jaro".equals(name, ignoreCase = true))
    ) {
        //.....
    }





}

fun isNumber() : Boolean{
    return true
}