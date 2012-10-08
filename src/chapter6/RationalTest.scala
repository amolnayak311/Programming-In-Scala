/**
 *
 */
package chapter6

/**
 * @author Amol
 *
 */
object RationalTest extends Application {

	val num1 = new Rational(2,3)
	val num2 = new Rational(1,2)
	println(num1 + " + " + num2 + " = " + (num1 + num2))

	val num3 = new Rational(1,2)
	val num4 = new Rational(2,3)
	println(num3 + " - " + num4 + " = " + (num3 - num4))
	println(num3 + " + " + num3 + " * " + num4 + " = " + (num3 + num3 * num4))
	println("(" + num3 + " + " + num3 + ") * " + num4 + " = " + ((num3 + num3) * num4))
	println(num3 + " / " + num4 + " = " + (num3 / num4))

	println(num3 + " - 2 = " + (num3 - 2))
	println(num3 + " + 4 = " + (num3 + 4))
	println(num3 + " / 4 = " + (num3 / 4))
	println(num3 + " * 3 = " + (num3 * 3))

}