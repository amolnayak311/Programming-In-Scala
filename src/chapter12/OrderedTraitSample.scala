package chapter12

object OrderedTraitSample {

  def main(args: Array[String]) {
	  val num1 = MyNumber(1)
	  val num2 = MyNumber(2)
	  println("Num1 is %s and Num2 is %s".format(num1, num2))
	  println("num1 < num2: " + (num1 < num2))
	  println("num1 > num2: " + (num1 > num2))
	  println("num2 > num1: " + (num2 > num1))
	  println("num1 <= num2: " + (num1 <= num2))
	  println("num1 >= num2: " + (num1 >= num2))
	  println("num2 >= num1: " + (num2 >= num1))
  }
}

/**
 * Define a class that has number as a public variable and also initialized using
 * the constructor.
 * This class extends from the trait MyTrait[MyNumber] and implements just
 * one method, compare. All other comparison methods are implemented in the trait
 * MyOrdered.
 *
 *
 */
case class MyNumber(val number:Int) extends MyOrdered[MyNumber] {

  /**
   * The concrete implementation of the compare method, this is the basis
   * for all other comparison operators
   */
  def compare(that:MyNumber):Int = (number - that.number)

  override def toString = number + ""
}

/**
 * The trait just has one abstract method that the class needs to
 * implement, all other comparison methods are implemented
 * around this method or each other.
 *
 */
trait MyOrdered[T] {
	/**
	 * This method returns negative number if the number to be compared
	 * is less than the number provided, 0 if equal and positive if that
	 * is greater than this
	 */
	def compare(that:T):Int

	final def <  (that:T):Boolean = compare(that) < 0

	final def >  (that:T):Boolean = compare(that) > 0

	final def <= (that:T):Boolean = <(that) || ==(that)

	final def >= (that:T):Boolean = >(that) || ==(that)
}