/**
 *
 */
package chapter10

/**
 * @author Amol
 *
 */
class UniformElement(c:Char, width:Int, height:Int) extends Element {

	/**
	 *
	 */
	def contents:Array[String] = Array.fill(height)(c.toString * width)
}