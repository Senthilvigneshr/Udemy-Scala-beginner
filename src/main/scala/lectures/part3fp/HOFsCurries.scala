package lectures.part3fp

object HOFsCurries extends App {

  val superFunction: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = null
  // higher order function

  //map, flatmap, filter in MYList

  //function that applies a function n times over a value x
  //nTimes(f, n, x)
  //nTimes(f, 3, x) = f(f(f(x))) = nTimes(f, 2, f(x)) = f(f(f(x)))
  //nTimes(f, n, x) = f(f(...f(x))) = nTimes(f, n-1, f(x))
  def nTimes(f: Int => Int, n: Int ,x: Int): Int = {
    if (n <= 0) x
    else nTimes(f, n - 1, f(x))
  }
    val plusOne = {
      (x: Int) => x + 1
    }
        println(nTimes(plusOne, 10, 1))

        //ntb(f,n) = x => f(f(f....(x)))

        def nTimesBetter(f: Int => Int, n: Int): (Int => Int) = {
          if (n <= 0) (x: Int) => x
          else (x: Int) => nTimesBetter(f, (n - 1))(f(x))
        }
        val plus10 = nTimesBetter(plusOne, 10)

        println(plus10(1))

        // curried function
        val superAdder: Int => (Int => Int) = (x: Int) => (y: Int) => x + y
        val add3 = superAdder(3) // y => 3 + y
        println(add3(10))
        println(superAdder(5)(10))

    //currying
    //function with multiple parameter list
    def curriedFormatter(c: String) (x: Double): String = c.format(x)

    val standardFormat: (Double => String) = curriedFormatter("%4.2f")
    val preciseFormat: (Double => String) = curriedFormatter("%10.8f")

    println(standardFormat(Math.PI))
    println(preciseFormat(Math.PI))

    def toCurry(f: (Int, Int) => Int): (Int => Int => Int) = {
      x => y => f(x,y)
    }

    def fromCurry(f: (Int => Int => Int)): (Int, Int) => Int = {
      (x,y) => f(x)(y)
    }

    //FuntionX
    def compose[A,B,T](f: A => B, g: T => A): T => B = {
      x => f(g(x))
    }

    def andThen[A,B,C](f: A => B, g: B => C): A => C = {
      x => g(f(x))
    }

    def superAdder2: (Int => Int => Int) = toCurry(_ + _)
    def add4 = superAdder2(4)
    println(add4(17))

    val simpleAdder = fromCurry(superAdder)
    println(simpleAdder(4,17))

    val add2 = (x: Int) => x + 2
    val times3 = (x: Int) => x * 3

    val composed = compose(add2, times3)
    val ordered = andThen(add2, times3)

    println(composed(4))
    println(ordered(4))

    }

