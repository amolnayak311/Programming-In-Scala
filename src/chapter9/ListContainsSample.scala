/**
 *
 */
package chapter9

/**
 * Sample program that tests whether a given list contains negative number and
 * if the list has an odd value in it
 *
 * @author Amol
 *
 */
object ListContainsSample {

  def main(args: Array[String]) {
	  println("Does array of 1, 2, 3, 4, 5 contain negative? "
	      + containsNegative(Array(1, 2, 3, 4, 5)))
	  println("Does List of 1, 2, 3, 4, 5 contain odd number? "
	      + containsOdd(List(1, 2, 3, 4, 5)))
	  println("Does array of 1, 2, 3, 4, 5 contain odd number? "
	      + containsOdd(List(1, 2, 3, 4, 5)))
	  println("Does array of 2, 4, 6, 8 contain odd number? "
	      + containsOdd(List(2, 4, 6, 8)))

  }

  /**
   * The method accepts an instance of traversable and checks if the number is odd
   * the internal implementation will break the loop as as soon as it comes acoss
   * the first number that is odd
   */
  def containsOdd(traversable: Traversable[Int]): Boolean = traversable.exists(_ % 2 == 1)

  /**
   *similar to above, but checks for the presence of negative number
   */
  def containsNegative(traversable: Traversable[Int]): Boolean = traversable.exists(_ < 0)
}