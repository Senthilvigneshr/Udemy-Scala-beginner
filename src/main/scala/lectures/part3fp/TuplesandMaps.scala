package lectures.part3fp

object TuplesandMaps extends App {

  // tuples = infinite ordered "lists"
  val aTuple = (2, "hello, Scala") // Tuple2[Int, String] = (Int, String)

  println(aTuple._1) // 2
  println(aTuple.copy(_2 = "goodbye Java"))
  println(aTuple.swap) // ("hello, Scala" , 2)

  // Maps - keys -> values
  val aMap: Map[String, Int] = Map()

  val phonebook = Map(("Jim", 555), "Daniel" -> 678).withDefaultValue(-1)
  // a -> b is sugar for (a, b)
  print(phonebook)

  // map ops
  println(phonebook.contains("Jim"))
  println(phonebook("Mary"))

  // add paring
  val newParing = "Mary" -> 567
  val newPhonebook = phonebook + newParing
  println(newPhonebook)

  // functions on maps
  //map, flatmap, filter
  println(phonebook.map(pair => pair._1.toLowerCase -> pair._2))

  // filerkeys
  println(phonebook.filterKeys(x => x.startsWith("J")))
  // mapvalues
  println(phonebook.mapValues(number => "0245" + number))

  // conversions to other collections
  println(phonebook.toList)
  println(List(("Daniel", 555)).toMap)
  val names = List("Bob", "James", "Angela", "Mary", "Daniel", "Jim")
  println(names.groupBy(name => name.charAt(0)))



}
