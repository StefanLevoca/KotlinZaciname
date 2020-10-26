package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    val direction: Direction = Direction.BACK
    println(direction.toString().toLowerCase())

    val directions = Direction.values()
    for(d in directions){
        println(d)
    }

    val dir: Direction = Direction.valueOf("FRONT")

    println(dir.shortName)
    println(dir.slovensky)

    when(dir){
        Direction.BACK -> println("idem "+Direction.BACK.slovensky)
        Direction.FRONT -> println("idem "+Direction.FRONT.slovensky)
        Direction.LEFT -> println("idem "+Direction.LEFT.slovensky)
        Direction.RIGHT -> println("idem "+Direction.RIGHT.slovensky)
    }

    val dirHodnota = when(dir){
        Direction.BACK -> "idem "+Direction.BACK.slovensky
        Direction.FRONT -> "idem "+Direction.FRONT.slovensky
        Direction.LEFT -> "idem "+Direction.LEFT.slovensky
        Direction.RIGHT -> "idem "+Direction.RIGHT.slovensky
    }

}