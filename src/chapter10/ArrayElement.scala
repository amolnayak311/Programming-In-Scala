/**
 *
 */
package chapter10

/**
 * The concrete implementation of the Element class
 * @author Amol
 *
 */
class ArrayElement(cont:Array[String]) extends Element {

	/**
	 * Check for the element not being null
	 */
	require(cont != null)

	/**
	 * Implements the abstract method and returns the String array that
	 * is passed as the constructor to the ArrayElement class
	 */
	def contents:Array[String] = cont
}