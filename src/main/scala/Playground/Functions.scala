package Playground

object Functions extends App {

  def aFunction(a: String, b: Int):String = {
    a + " " + b
  }
  println(aFunction("Senthil",25))

  def aParameterlessFunction() : Int = 42
  println(aParameterlessFunction())
  //println(aParameterlessFunction)

  def aRepeatedFuntion(aString: String, n: Int):String = {
    if (n ==1) aString
    else aString + aRepeatedFuntion(aString, n-1)

  }
  println(aRepeatedFuntion ("hello",4))
  //WHEN YOU NEED LOOPS, USE RECURSION.

  def aFuntionWithSideEffects(aString: String): Unit = println("senthil")

  def aBigFuntion(n: Int): Int = {
      def aSmallFuntion(a: Int, b: Int): Int = a + b

      aSmallFuntion(n, n-1)
  }
  println(aBigFuntion(5))

  /*
  1. A greeting function (name, age) => "Hi, My name is $name and I am $age years old"
  2. Factorial function 1 * 2 * 3 ... * n
  3. A fibonacci function
      f(1) = 1
      f(2) = 2
      f(n) = f(n - 1) + f(n - 2)
  4. A function to test if a no is prime
  */

  def greetingForKids(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }
    println(greetingForKids("Senthil",15))

    def factorial(n:Int): Int = {
      if (n <= 0) 1
      else n * factorial(n - 1)
    }
      println(factorial(5))

      def fibonacci(n: Int):Int = {
        if(n <= 2) 1
        else fibonacci(n-1) + fibonacci(n-2)

      }
      println(fibonacci(8))

  def isPrime2(i :Int) : Boolean = {
     if (i <= 1) false
      else if (i == 2) true
      else
       !(2 to (i-1)).exists(x => i % x == 0)
     }
    println(isPrime2(3))
    println(isPrime2(25))
  // isPrime2: (i: Int)Boolean
}
