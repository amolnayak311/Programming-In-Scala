/**
 *
 */
package chapter4

import ChecksumAccumulator.calculate

/**
 * @author Amol
 *
 */
object Summer {

  def main(args: Array[String]) {
	  val values = Array("Element1", "Element2", "lEemnet2")
	  for(str <- values) {
	    println("Value is: " + str + ", checksum is " + calculate(str))
	  }
  }
}