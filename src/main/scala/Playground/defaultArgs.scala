package Playground

object defaultArgs extends App{

  def trFact(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else trFact(n - 1, n * acc)
  }
    val fact10 = trFact(10, 2)

  println(trFact(10))

  def savePicture(format: String = "jpg", width: Int = 600, height:Int = 1080): Unit = println("saving picture")
  //savePicture(800)
  savePicture(width = 800)

  /*
  1. pass in every leading arguments
  2. name the arguments
  */
}
