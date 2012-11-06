/**
 *
 */
package chapter15

/**
 * Demonstrate the Option type in scala
 * @author Amol
 *
 */
object OptionTypeSample {

  def main(args: Array[String]) {
	  var map = Map("India" -> "Delhi", "Japan" -> "Tokyo", "South Africa" -> "Johannesburg")

	  matchValues("India", map get "India")
	  matchValues("Egypt", map get "Egypt")

	  /**
	   * The method accepts the country and the value looked up from the Map for the given
	   * country. The value returned from the  map is of type Option[String]. This will be
	   * Some(<value in map>> or None of value not found in map. We do pattern matching to match
	   * the value if the value is found and print the value or to None if the value not found
	   *
	   *
	   */
	 def matchValues(country:String, value:Option[String]) {
	    value match {
	      case Some(e) => printf("Capital of %s is %s\n", country, e)
	      case None => printf("No capital found for %s\n", country)
	    }
	  }

	  println()
	  //Now in the list below we have three element, Apple, None and Grapes
	  val fruits = List(Some("Apple"), None, Some("Grapes"))

	  //For iterating through the List we want only Some(e)  and hence or printing the
	  //result we get two elements only, Apple and Grapes which match the pattern
	  for(Some(fruit) <- fruits) println(fruit)
  }
}