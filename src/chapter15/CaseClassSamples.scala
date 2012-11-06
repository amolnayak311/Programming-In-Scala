/**
 *
 */
package chapter15

/**
 * @author Amol
 *
 */
object CaseClassSamples {

  def main(args: Array[String]): Unit = {
		  //Instantiate two case classes
		  val p1 = Person("FirstName", "SecondName")
		  val p2 = Person("FirstName", "SecondName")

		  //Case class has automatically generated toString method that gets invoked
		  println("toString of p1 is" + p1)

		  //Case class has an automatically generated hashCode method
		  println("hashCode of p1 is  " + p1.hashCode)

		  //invoking p1 equals p2 gives us the
		  println("p1 == p2 is " + (p1 == p2))
		  println("Copying the class p1")
		  val p3 = p1.copy()
		  println("p3 is " + p3)
		  val p4 = p1.copy(secondName = "SecName")
		  println("""p1.copy(secondName = "SecName") gives """ + p4)

  }
}

case class Person(firstName:String, secondName:String)