package lectures.part2oop

object Generics extends App {

  class MyList[A] {
    // use the type A
  }

  class MyMap[Key, Value]
  val listofIntegers = new MyList[Int]
  val listofStrings = new MyList[String]

  //generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptylistofIntegers = MyList.empty[Int]

  //variance problem
  class Animal
  class Cat extends  Animal
  class Dog extends Animal

  //1. yes, List[cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  //animalList.add(new Dog) ?? Hard question

  //2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // No - CONTRAVARIANT
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  //bounded types

}
