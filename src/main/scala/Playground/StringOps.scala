package Playground

object StringOps extends App{

  val str: String ="Hello, I am learning Scala"

  println(str.charAt(1))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace("learning", "practising"))
  //println(str.toLowerCase())
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  //println(str.reverse)
  println(str.take(5))


  // SCALA specific : String interpolators.

  //S-interpolator
  val name = "Senthil"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anothergreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old"

  println(greeting)
  println(anothergreeting)

  //F-interpolator

  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"

  println(myth)

  //raw-interpolator

  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")

}
