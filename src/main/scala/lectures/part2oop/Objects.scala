package lectures.part2oop

object Objects  {

  //SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY("STATIC")
  object Person { //type + its only instance
    //"Static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    //factory method
    def apply(mother: Person, fater: Person): Person = new Person("Bobby")
  }
  class Person(val name: String) {
    // instance-level functionality
  }

  def main(args: Array[String]): Unit = {

  println(Person.N_EYES)
  println(Person.canFly)

  //SCALA object = Singleton Instance

  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john)

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val bobby = Person.apply(mary,john)
  //or
  //val bobby = Person(mary,john)

  //SCALA Applications = Scala objects with
  // def main(args: Array[String]): Unit
  // equivalent to public static void main form java

  }

}
/*
  TAKEAWAYS

Scala doesn't have "static" values/methods

scala objects
  are in their own class
  are the only instance
  singleton pattern in one line!

scala companions
  can access each other's private members
  scala is more OO than java

scala applications
  def main(args: Array[String]): Unit
  */
