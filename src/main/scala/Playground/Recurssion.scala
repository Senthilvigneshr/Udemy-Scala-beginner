package Playground

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recurssion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }
  }
    println(factorial(10))
   // println(factorial(5000))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression
    }
      factHelper(n, 1)
    }

  println(anotherFactorial(10))
  println(anotherFactorial(5000))


  /*
  anotherFactorial(10) = factHelper(10,1)
  =factHelper(9, 10 * 1)
  =factHelper(8, 9 * 10 * 1)
  =factHelper(7, 8 * 9 * 10 * 1)
  =......
  =factHelper(2, 3 * 4 *..... * 10 * 1)
  =factHelper(,1 1 * 2 * 3 * 4 * 5 .... * 10)
  = 1 * 2 * 3 * 4 * 5 * .... * 10
  */

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION.

  /*
  1. Concatenate a string n times.
  2. isPrime function tail recursive.
  3. Fibonacci function, tail recursive.
  */

  def concatenateTailrec(aString: String, n: Int, accumulator: String): String = {
    if(n <= 0 ) accumulator
    else concatenateTailrec(aString, n - 1, aString + accumulator)
  }
  println(concatenateTailrec("hello", 3, ""))

  def isPrime(n: Int): Boolean = {
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
        }
    isPrimeTailrec(n / 2, true)
  }
  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n: Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int = {
      if(i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)
    }
    if(n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }
  println(fibonacci(8))
  }



