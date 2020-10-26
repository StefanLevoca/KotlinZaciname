package sk.jaroslavbeno.kotlin.ulohy

fun main(args: Array<String>) {
    /*
    1 2 3 4
    1 2 3
    1 2
    1
     */

    val n = 4

    for(i in n downTo 1){
        for(j in 1..i){
            print("$j ")
        }
        print("\n")
    }
    print("\n")
    /*
    1
    1 2
    1 2 3
    1 2 3 4
     */
    for(i in 1..n){
        for(j in 1..i){
            print("$j ")
        }
        print("\n")
    }

    print("\n")
    /*
    _ 2 3 4
    1 _ 3 4
    1 2 _ 4
    1 2 3 _
     */
    for(i in 1..n){
        for(j in 1..n){
            if(i == j){
                print("_ ")
            }else {
                print("$j ")
            }
        }
        print("\n")
    }

}