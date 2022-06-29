package Training

/*6.Create a class with public and protected members*/

class abc
{
  private var a:Int = 123
  def display(): Unit = {
    {
      a = 8
      println(a)
    }
  }
}

object access extends App
{
  // class abc is accessible
  // because this is in the same enclosing scope
  var e = new abc()
  e.display()
}

class gfg
{
  // declaration of protected member
  protected var a:Int = 123
  def display(): Unit = {
    {
      a = 8
      println(a)
    }
  }
}

// class new1 extends by class gfg
class new1 extends gfg
{
  def display1(): Unit = {
    {
      a = 9
      println(a)
    }
  }
}

object access1 extends App
{
  // class abc is accessible because this
  // is in the same enclosing scope
  var e = new gfg()
  e.display()
  var e1 = new new1()
  e1.display1()

}