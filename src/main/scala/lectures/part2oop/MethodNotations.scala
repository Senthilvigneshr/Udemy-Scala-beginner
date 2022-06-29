package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, What the heck?!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary","Inception")
  println(mary.likes("Inception" ))
  println(mary likes "Inception") // equivalent
  // infix notation = operator notation (syntactic sugar)
  // only works with methods which has one parameter

  //operators in Scala
  val tom = new Person("Tom", "Fightclub")
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS

  //Prefix notation -- unary operator . they are also methods
  val x = -1 //equivalent to 1.unary_-
  val y = 1.unary_-
  // Unary works only wit + - ~ !

  println(!mary)
  println(mary.unary_!)

  //postfix notation
  println(mary.isAlive)
  //println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary()) // equivalent

}
