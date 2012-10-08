/**
 *
 */
package chapter6

/**
 * @author Amol
 *
 */
class Rational(n:Int, d:Int) {

  //Mandatory check that the denominator is not 0
  require(d != 0)
  private val g = gcd(n, d) abs
  val numerator = n/g
  val denominator = d/g

  //Override the toString
  override def toString():String = if(denominator != 1)numerator + "/" + denominator else numerator + ""

  //Define an auxiliary constructor
  def this(n:Int) = this(n, 1)

  /**
   * Find GCD of two numbers using euclidean method
   */
  private def gcd(n1:Int, n2:Int):Int =  if(n2 == 0) n1 else gcd(n2, n1 % n2)

  /**
   * The add method
   */
  def +(that:Rational):Rational = new Rational(numerator * that.denominator +
		  			denominator * that.numerator, denominator * that.denominator)

  /**
   * Overloaded add method
   */
  def +(that:Int):Rational = new Rational(numerator +  that * denominator, denominator)


  /**
   * The minus method
   */
  def -(that:Rational):Rational = new Rational(numerator * that.denominator -
		  			denominator * that.numerator, denominator * that.denominator)


  /**
   * The overloaded minus method
   */
  def -(that:Int):Rational = new Rational(numerator - that * denominator, denominator)

 /**
  * The multiply method
  */
  def *(that:Rational):Rational = new Rational(numerator * that.numerator,
		  			denominator * that.denominator)

  /**
   * The overridden multiply method
   */
  def *(that:Int):Rational = new Rational(numerator * that, denominator)

  /**
   * The divide method
   */
  def /(that:Rational):Rational = new Rational(numerator * that.denominator,
		  			denominator * that.numerator)

  /**
   * The overloaded divide method
   */
  def /(that:Int):Rational = new Rational(numerator * that, denominator)

}