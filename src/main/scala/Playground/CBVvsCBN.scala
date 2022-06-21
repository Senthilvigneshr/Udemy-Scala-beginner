package Playground

object CBVvsCBN extends App{

  def callByValue(x: Long): Unit = {
    println("call by value " + x)
    println("call by value " + x)
  }

  def callByName(x: => Long): Unit = {
    println("call by name " + x)
    println("call by name " + x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infinite(), 34)
  printFirst(34, infinite())

  /*
  call by value:
   - value is computed before call
   - same value used everywhere

  call by name:
   - expression is passed literally
   - expression is evaluated at every use within
  */
}
