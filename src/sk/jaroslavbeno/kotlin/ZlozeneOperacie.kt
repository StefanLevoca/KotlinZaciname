package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    for (i in 0..99) {
        println(i)
        if (i % 2 == 0) {
            for (j in 0..49) {
                for (k in 0..49) {
                    println(k)
                    if (k == 20) {
                        if (true) {
                            if (true) {
                                if (true) {
                                    //...
                                }
                            }
                        }
                    } else {
                        while (k < 10) {
                            println(k)
                        }
                    }
                }
            }
        }
    }

}