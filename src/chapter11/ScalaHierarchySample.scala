/**
 *
 */
package chapter11
import java.lang.Long

/**
 * @author Amol
 *
 */
object ScalaHierarchySample {

  def main(args: Array[String]) {
	val int1 = new Integer(1)
	val int2 = new Integer(1)

	//This in turn invokes equals on the clases
	println("int1 == int2 is " + (int1 == int2))

	//The eq operator tests the reference's equality, similar to == in java on objects
	println("int1 eq int2 is " + (int1 eq int2))

	val long1 = new Long(1)
	//This does NOT invoke the equals on Integer as this would have returned false
	//otherwise, here the value is boxed and is handled specially to check for the
	//equality and hence this returns true
	println("int1 == long1 is " + (int1 == long1))

	println("int1's hashcode is " + int1.hashCode)
	println("int2's hashcode is " + int2.hashCode)


	println("int1's scala hashcode is " + int1.##)
	println("int2's scala hashcode is " + int2.##)

	val int3 = 3
	val int4 = 4

	println("int1's hashcode is " + int3.hashCode)
	println("int2's hashcode is " + int4.hashCode)


	//The ## is the hash code method in scala
	println("int1's scala hashcode is " + int3.##)
	println("int2's scala hashcode is " + int4.##)

	//Now for Some String processing

	val str1 = new String("abc")
	val str2 = new String("abc")

	println("str1 eq str2 is " + (str1 eq str2))
	//== should give true unlike in java
	println("str1 == str2 is " + (str1 == str2))


	//example of class nothing

	def error(msg:String):Nothing = throw new IllegalArgumentException(msg)

	def divide(numerator:Int, divisor:Int):Int = {
	  if(divisor != 0)
	    numerator/divisor
	   else
	     error("Attempting to divide by zero")
	     //Note like unlike where we have to return 0, or null
	     //in even in case we are throwing an exception is taken care
	     //here by returning Nothing from the error method, we cannot return
	     //Null here as AnyVal's don't any other sub class other than Nothing, Null
	     //is a subclass of All AnyRef's (along with Nothing)
	     //error can return Null if the return type is Integer rather than Int
	}

	println()
	println("8/2: " + divide(8, 2))
	println("Trying to divide by 0, should get IAE")
	try {
		println("8/0: " + divide(8, 0))
	} catch {
	  case e:IllegalArgumentException => println("""Caught %s, error message is "%s"""".format(e.getClass().getCanonicalName(), e.getMessage()))
	  case e:Exception => throw e
	}
  }
}
