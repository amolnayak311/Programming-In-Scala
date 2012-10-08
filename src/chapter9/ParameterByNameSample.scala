/**
 *
 */
package chapter9

/**
 * We will create two assertion methods where the input expression throws
 * an exception. With assertion disabled, we will demonstrate how the two forms differ
 *
 * @author Amol
 *
 */
object ParameterByNameSample {

  var assertionEnabled = false;

  /**
   * The method checks if the passed expression evaluates to true or false
   * throws an AssertionError if the expression is false. If assertions are disabled
   * it returns true
   */
  def expressionAssert(expr:Boolean)
  	= 	if(assertionEnabled)
  			if(expr) true else throw new AssertionError("Assertion failed")
  		else
  		  true

  /**
   * The method accepts a parameter by name, an operation that returns a Boolean value.
   * Other rules are same as above method. The real difference is in the fact that the
   * op gets executed only when it is needed, that is if the assertionEnabled is true
   *
   */
  def paramByNameAssert(op: => Boolean)
  	= if(assertionEnabled)
  		if(op) true else throw new AssertionError("Assertion failed")
  	  else
  		true

  def main(args:Array[String]) {
  		println("expressionAssert( 3 < 0) with assertion disabled is " + expressionAssert( 3 < 0))
  		assertionEnabled = true
  		try {
  			println("expressionAssert( 3 < 0) with assertion enabled is " + expressionAssert( 3 < 0))
  		} catch {
  		  case e: AssertionError => println("Caught Expected Assertion Error")
  		  case e: Throwable => throw e
  		}

  		//now disabling assertions
  		println("\n\nDisabling assertion")
  		assertionEnabled = false
  		println("\n\nCalling with an expression yielding an Exception, assertions ae disabled")
  		try {
  		  expressionAssert(3/0 > 0)
  		} catch {
  			case e:ArithmeticException => println("Caught Arithmetic Exception")
  			case e:Throwable => throw e
  		}
  		println("Should have caught an arithmetic exception above")
  		println("\n\nNow we will invoke the function which accepts parameter by name")
  		try {
  		  paramByNameAssert(3/0 > 0)
  		} catch {
  		  case e:ArithmeticException => println("Caught Arithmetic Exception")
  		  case e:Throwable => throw e
  		}
  		println("Should not have printed the line for catching the Arithemetic exception above")





  }

}