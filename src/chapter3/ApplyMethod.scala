/**
 *
 */
package chapter3
import java.util.ArrayList
import java.util.List

/**
 * Any object accessed with a () will automatically invoke the apply method
 * of the instance
 *
 * @author Amol Nayak
 *
 */
object ApplyMethod {

  def main(args: Array[String]) {
	  println("\nAdding two persons to store")
	  var ps = new PersonStore
	  ps add Person("First", 1)
	  ps add Person("Second", 2)

	  println("\nNow geting second element from the store")
	  println(ps(1))
	  println("\nNow geting third element from the store")
	  println(ps(2))

  }

}

case class Person(name:String, age:Int)

class PersonStore {
  var personNumbers:List[Person] = new ArrayList()

  def add (p:Person) = {
    personNumbers.add(p)
  }

  def apply(i:Int): Person = {
    if(personNumbers.size > i)
      personNumbers get i
    else
       null
  }
}


