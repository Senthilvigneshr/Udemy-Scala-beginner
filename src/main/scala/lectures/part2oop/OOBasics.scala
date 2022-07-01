package lectures.part2oop

import java.io.Writer

object OOBasics extends App {

 val person = new Person("Senthil", 15)
 println(person.age)
 println(person.x)
 person.greet("Daniel")
 person.greet()


  val author = new Writer("Charles", "Dicken", 1812)
  val novel = new Novel("Great Expectation",1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}


//Constructor
class Person(name: String, val age: Int = 0) {
  //Class parameters are NOT fields
  //body
  val x = 2
  println(1 + 2)

  //method
  def greet(name: String): Unit = println(s"${this.name} says : Hi, $name")

  //overloading
  def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructor

  def this(name: String) = this(name, 0)

  def this() = this("John Doe")
}
/*
Novel and a Writer

Writer : first name, surname, year
 - method : fullname

Novel : name, year of release, author
 - authorAge
 - isWrittenBy(author)
 - copy(new year of release) = new instance of Novel
 */

class Writer(firstName: String, surName: String, val year: Int) {
  def fullName: String = firstName + " " + surName
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)

}

/*
Counter Class
  - receives an int value
  - method current count
  - method to increment/dec => new Counter
  - overload inc/dec to receive an amount
*/
 class Counter(val count: Int = 0 ) {
    def inc = {
      println("incrementing")
      new Counter(count + 1)
    } // immutability
    def dec = {
      println("decrementing")
      new Counter(count -  1)
    }

    def inc(n: Int): Counter = {
      if(n <= 0) this
      else inc.inc(n-1)

    }
    def dec(n: Int): Counter = {
        if(n <= 0) this
        else dec.dec(n-1)
    }
  def print = println(count)
}

/*Takeaways
  Defining classes --  class Person(name: String, age: Int)
  Instantiating -- val bob = new person("Bob",25)
  Parameters vs fields -- class person (val name: String, age: Int)
  Defining methods -- def greet(): String = { ... }
  calling methods -- val bobsayshi = bob.greet

  The keyword 'this'
*/