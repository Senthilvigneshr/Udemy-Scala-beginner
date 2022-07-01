package lectures.part2oop

object Enums {

  //enums are a datatype that you can define much like a class


  enum Permissions {
    case READ, WRITE, EXECUTE, NONE

    // add fields or methods
    def openDocument(): Unit = {
      if(this == READ) println("opening document....")
      else println("reading not allowed")
    }
  }
  val somePersmissions: Permissions = Permissions.READ

  //constructor args
  enum PermissionWithBits(bits: Int) {
    case READ extends PermissionWithBits(4) //100
    case WRITE extends PermissionWithBits(2) //010
    case EXECUTE extends PermissionWithBits(1) //011
    case NONE extends PermissionWithBits(0) // 000
  }

  //have companion objects

  object PermissionWithBits {
    def formBits(bits: Int): PermissionWithBits =
      PermissionWithBits.NONE
  }

  //standard API
  val somePermissionsOrdinal = somePersmissions.ordinal
  val allPermissions = PermissionWithBits.values //array of all possible values of enum
  val readPermission: Permissions = Permissions.valueOf("READ") //Permission.READ

  def main(args: Array[String]): Unit = {
    somePersmissions.openDocument()
    println(somePermissionsOrdinal)
    println(allPermissions)
  }
}
