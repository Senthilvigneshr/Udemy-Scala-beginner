package Training

/*5.Create a sample class and object and include the if else/loop/add functions in it.*/

class Dog(name:String, breed:String, age:Int, color:String )
{
  println("My name is:" + name + " my breed is:" + breed);
  println("I am: " + age + " and my color is :" + color);

}
object Class
{

  def main(args: Array[String]): Unit = {

    // Class object
    var obj = new Dog("tuffy", "papillon", 5, "white");
  }

}
