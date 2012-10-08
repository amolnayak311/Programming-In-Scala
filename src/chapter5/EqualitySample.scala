/**
 *
 */
package chapter5

import chapter5.Gender._

/**
 * @author Amol
 *
 */
object EqualitySample {

  def main(args: Array[String]) {
	  val per1 = Person("P1", 28, MALE)
	  val per2 = Person("P2", 27, FEMALE)
	  val per3:Person = null
	  val per4 = Person("P1", 28, MALE)
	  val per5:Person = null

	  println("per1 == per2 " + (per1 == per2))
	  println("per1 == per3 " + (per1 == per3))
	  println("per3 == per1 " + (per3 == per1))
	  println("per3 == per3 " + (per3 == per3))
	  println("per1 == per4 " + (per1 == per4))
	  println("per3 == per5 " + (per3 == per5))
  }
}
case class Person(name:String, age:Int, gender:Gender)