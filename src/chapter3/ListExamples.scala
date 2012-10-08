/**
 *
 */
package chapter3


/**
 * @author Amol
 *
 */
object ListExamples {

  def main(args: Array[String]) {
	  //Initialize empty list
	  var emptyList = Nil
	  println("Nill List is " + emptyList)
	  var nonEmptyList = "One" :: "Two" :: "Three" :: "Four" :: emptyList
	  println("nonEmptyList is " + nonEmptyList)

	  //The use of count function, it function as parameter which will be
	  //invoked with each element of the list, it will return true whenever
	  //the function returns true

	  println("Elements with length gt 3 are " +
	      (nonEmptyList count(item => item.length > 3)))

	  println("With dropRight 2 " + nonEmptyList.dropRight(2))
	  println("With drop 2 " + nonEmptyList.drop(2))
	  println("Equals with Two " + nonEmptyList.exists(arg => arg equals "Two"))
	  println("Equals with Ten " + (nonEmptyList exists(arg => arg equals "Ten")))
	  println("Get all elements with length gt 3 is " + (nonEmptyList filter(value => value.length > 3)))
	  println("First element of the list is " + nonEmptyList.head)
	  println("Last element of the list is " + nonEmptyList.tail)
	  println("All element except last is " + nonEmptyList.init)
	  println("All element except first is " + nonEmptyList.tail)
	  println("Sorted by Name " +
			  (nonEmptyList sort((first,second) =>
	    							first.compareTo(second) <= 0
	    					)
			  )
			 )
	  println("All Names appended with a 'y' " + nonEmptyList.map(elem => elem + "y"))
	  println("adding element to list")
  }
}