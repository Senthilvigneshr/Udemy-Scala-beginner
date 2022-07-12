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

  /*
    1. Whta would happen if i have 2 orinial entries "Jim" -> 555 and JIM -> 999 ??

    2. Overly simpilfied social network based on maps
      Person = String
      - add a person to a network
      - remove
      - friend (mutual)
      - unfriend

      - number of friends of a person
      - person with most freiends
      - how many people have no friends
      - if there is a social connection between two people(direct or not)
    */

    def add(network: Map[String, Set[String]], person: String): Map[String, Set[String]] = {
      network + (person -> Set())
    }

  def friend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
      val friendsA = network(a)
      val friendsB = network(b)

      network + (a -> (friendsA + b)) + (b -> (friendsB + a))
    }

    def unfriend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
      val friendsA = network(a)
      val friendsB = network(b)

      network + (a -> (friendsA - b)) + (b -> (friendsB - a))
    }

    def remove(network: Map[String, Set[String]], person: String): Map[String, Set[String]] = {
      def removeAux(friends: Set[String], networkAcc: Map[String, Set[String]]): Map[String, Set[String]] = {
        if (friends.isEmpty) networkAcc
        else removeAux(friends.tail, unfriend(networkAcc, person, friends.head))
        }
        val unfriended = removeAux(network(person), network)
        unfriended - person
    }

      val empty: Map[String, Set[String]] = Map()
      val network = add(add(empty, "Bob"), "Mary")
      println(network)
      println(friend(network, "Bob", "Mary"))
      println(unfriend(friend(network, "Bob", "Mary"), "Bob", "Mary"))
      println(remove(friend(network, "Bob", "Mary"), "Bob"))
}
