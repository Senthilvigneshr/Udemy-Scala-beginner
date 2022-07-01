package lectures.part2oop

object AbstractDataTypes extends App {

  //abstract
  abstract class Animal {
    val creatureType: String = "wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"

    def eat: Unit = println("crunch, crunch")
  }

  //traits
  // have abstract fields and methods
  //they can be inherited the long classes

  trait Carnivore {
    def eat(animal: Animal): Unit

  }
 class Crocodile extends Animal with Carnivore {
   override val creatureType: String = "croc"
   def eat: Unit = println("nomnom")
   def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
 }
    val dog = new Dog
    val croc = new Crocodile
    croc.eat(dog)

    //trait vs abstract class
    //1 - traits do not have constructor parameters
    //2 - multiple traits may inherited by the same class
    //3 - traits = behaviour. abstract class = "thing"
}
