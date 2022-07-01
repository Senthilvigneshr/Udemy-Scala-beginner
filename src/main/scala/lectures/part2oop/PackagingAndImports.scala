package lectures.part2oop

import Training.Cinderella
import scala.language.postfixOps


object PackagingAndImports extends App {

  //package members are accessible by their simple names
  val writer = new Writer("Daniel", "RockTheJVM", 2018)

  //import the package
  val princess =  Training.Cinderella

  //packages are in hierarchy
  //matching folder structure

  //package object

  //default imports
  //java.lang - String, Object, Exception
  //Scala - Int, Nothing, Funtion
  //Scala.predef - println, ???


}
