package Training

object ScalaModule1 extends App {

  /*
  1.Create variables for all the available datatypes in Scala, assign wrong values for variable and record the error
  (Example: Assign string to int variable and record the error).
  */

  /*var a: Boolean = 1
  var a1: Byte = 1266
  var a2: Float = 2.45673
  var a3: Int = 3f
  var a4: Short = 452222222
  var a5: Double = 2.93846523
  var a6: Char = '1'
  if (a == true)
  {
    println("boolean:Scalatraining")
  }
  println("byte:" + a1)
  println("float:" + a2)
  println("integer:" + a3)
  println("short:" + a4)
  println("double:" + a5)
  println("char:" + a6)
*/
/*  2.Create string variables perform concat, upper and lower functions*/

  val str1 = "Welcome, "
  val str2 = "to Scala World!"

  val newStr = str1.concat(str2)

  println("New String : " + newStr  )
  println("We can use concat" + " using '+' operator as well")
  println(str1.toLowerCase())
  println(str2.toUpperCase())

/*  3.Create if else/loop statements for printing 10 numbers.*/

/*  4.Create function to add 2 numbers.*/

   def aFuntion(a: Int, b: Int): Int = {
     a + b
   }
   println(aFuntion(1,2))

    }
/*5.Create a sample class and object and include the if else/loop/add functions in it.*/

/*6.Create a class with public and protected members*/





