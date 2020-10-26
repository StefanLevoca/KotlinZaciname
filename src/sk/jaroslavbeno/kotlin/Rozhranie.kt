package sk.jaroslavbeno.kotlin

interface Animal{
    fun makeNoise()
    fun move(direction: Direction)
    fun eat(food: String)
}

class Cat: Animal{
    override fun makeNoise() {
        println("Cat do meow")
    }

    override fun move(direction: Direction) {
        println("Moves in $direction")
    }

    override fun eat(food: String) {
        println("Cat eat $food")
    }
}