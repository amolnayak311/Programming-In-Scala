/**
 *
 */
package chapter7

/**
 * @author Amol
 *
 */
object FinallyReturn {

  def main(args: Array[String]) {

	  //notice the difference in the return values
	  val v1 = m1()
	  val v2 = m2()

	  println("v1 is " + v1)
	  println("v2 is " + v2)
  }

  private def m1():Int =  try return 1 finally return 2


  private def m2():Int = try 1 finally 2
}