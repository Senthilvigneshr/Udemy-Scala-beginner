package Playground

object Expressions extends App{

  val x = 1 + 2 //EXPRESSION
  println(x)

  println(1 + 5 * 5)

  println (1 == x)
  // == != > < >= <=

  println(!(1==x))
  // ! && ||

  var aVaraible = 2
  aVaraible +=3 //also works with -= *= /= ... Side effects which works only on var
  println(aVaraible)

  //Instructions(tell the computer to do something) vs Expressions(has a value or a type)
  // IF expression

  val aCondition = true
  val aConditionedValue = if(aCondition) 6 else 3 //IF expression
  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  //NEVER WRITE LIKE THIS
  // Everything in Scala is Expression!

  val aWeirdValue = (aVaraible = 7) // Unit === void (means it wont return anything meaningful
  println(aWeirdValue)

  // side effects : println(),whiles,reassigning

  //Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 4) "hello" else "goodbye"

  }
  println(aCodeBlock)


  //diff btw "hello world" vs prinln("hello world")
  //and -- types -- 1.String 2.Unit

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 500
    49
  }
  println(someOtherValue)

}

