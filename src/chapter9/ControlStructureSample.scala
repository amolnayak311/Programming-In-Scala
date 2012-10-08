/**
 *
 */
package chapter9

/**
 * @author Amol
 *
 */
object ControlStructureSample {

  /**
   * Accepts two parameters, one is the method that takes double as parameter
   * and return double. The second is the parameter that needs to be passed
   * on to the first parameter passed
   */
  def twice(op:Double => Double, x:Double) = op(op(x))

  /**
   *This invokeTimes is used to invoke the enclosing body given number of times
   *
   *It is an example of currying where the first parameter is an Int value that
   *is the number of times the enclosing body is to be invoked.
   *second parameter is an no arg method that reurnes nothing (Unit)
   *the body of this function is to invoke the given operation 'times' number of times
   */
  def invokeTimes(times:Int)( op: => Unit) = for(index <- 0 until times) op

  def main(args: Array[String]) {
	  val result = twice(_ + 1, 5)
	  println("result is " + result)

	  println("\n")
	  invokeTimes(3) {
	    println("First")
	    println("Second")
	  }
  }
}