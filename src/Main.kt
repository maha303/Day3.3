import kotlin.random.Random

fun main (){

    abstract class Animal(name: String, age: Int){
        abstract fun talk()
    }
    class Dog(val name: String, val age: Int): Animal(name, age){
        override fun talk(){
            println("$name: Woof")
        }
    }

    class Cat(val name: String, val age: Int): Animal(name, age){
        override fun talk() {
            println("$name: Meow")
        }
    }
    val ages = listOf(3, 5, 2, 6, 12, 9, 6, 7, 11)

    val dogs = listOf<Dog>(
        Dog("Fluffy", ages[Random.nextInt(ages.size)]),
        Dog("Rufus", ages[Random.nextInt(ages.size)]),
        Dog("Brian", ages[Random.nextInt(ages.size)]),
        Dog("Fred", ages[Random.nextInt(ages.size)]),
        Dog("Spot", ages[Random.nextInt(ages.size)])
    )

    val cats = listOf<Cat>(
        Cat("Lili", ages[Random.nextInt(ages.size)]),
        Cat("Meep", ages[Random.nextInt(ages.size)]),
        Cat("Patchy", ages[Random.nextInt(ages.size)]),
        Cat("Furball", ages[Random.nextInt(ages.size)]),
        Cat("Snowball", ages[Random.nextInt(ages.size)])
    )
    for(cat in cats){
        cat.talk()
        for(dog in dogs){
            if(cat.age < dog.age){
                dog.talk()
            }
        }
    }
}