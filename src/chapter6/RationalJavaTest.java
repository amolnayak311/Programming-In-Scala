/**
 *
 */
package chapter6;

/**
 * @author Amol
 *
 */
public class RationalJavaTest {

	public static void main(String[] args) {
		Rational rat1 = new Rational(2,3);
		Rational rat2 = new Rational(1,2);

		//The plus is $plus in the generated java class
		System.out.println(rat1 + " + " + rat2 + " = " + rat1.$plus(rat2));
	}
}
