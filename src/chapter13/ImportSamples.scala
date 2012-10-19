/**
 *
 */
package chapter13

import bobsrockets.navigation.Navigator
import bobsrockets.fleets._
import bobsrockets.fleets.Fleet._

//import all the classes from notebook except Apple
import notebook.{Apple => _, _}

//import all the classes from fruits package
import fruits._

//lets import notebook.Apple as Mac
import notebook.{Apple => Mac}


/**
 * @author Amol
 *
 */
object ImportSamples {

  def main(args: Array[String]) {
    //this demostrates how we have imported the Navigator class by adding
    //a import bobsrockets.navigation.Navigator, this is similar to the import in java
	  val nav = new Navigator

	  //Notice how we imported Fleet using import bobsrockets.fleets._
	  //This is similar to the import in java using the wildcard *
	  val fleet = new Fleet

	  //Now we want to access the inner elements of the Fleet class
	  //similar to static import in java we can import elements/attributes
	  //of a class. This is not restricted to static components though
	  //However to have imports like import bobsrockets.fleets.Fleet._ , just
	  //having the class is not enough, we need to have a companion object along with it

	  val s = ship

	  //Now we want to add the two numbers in the bobsrockets.SomeObject

	  import bobsrocket.SomeObject._;

	  println("number1 + number2 is " + (number1 + number2))

	  //see how imports are organized
	  println("Printing the apple, " +  Apple)
	  println("Printing the Vaio, " + Vaio)
	  println("Printing the Mac, " +  Mac)


	 }
}