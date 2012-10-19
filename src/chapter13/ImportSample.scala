/**
 *
 */
/**
 * @author Amol
 *
 */
package chapter13 {


	package inner {

	  object InnerObjectA {
	    private 		 val number1 = 1
	    private[inner] 	 val number2 = 2
	    protected 		 val number3 = 3
	    protected[inner] val number4 = 4
	  }

	  object InnerObjectB {
		  //InnerObjectB doesnt extend from InnerObjectA

		  	//uncommenting the below line doesnt work as number1 is private in the object
		  	//val v1 = InnerObjectA.number1

		  	//Below line however works as the number2 is private in the package inner
		  	val v2 = InnerObjectA.number2

		  	//uncommenting the below line doesnt work as number1 is protected in the object and we dont extend it
		  	//val v3 = InnerObjectA.number3

		  	//Below line works as its protected in the package, hence the behavior is same as in java's protected
		  	val v4 = InnerObjectA.number4
	  }

	  class Super {
		  protected val number1 = 1
	  }

	  class InnerObjectC extends Super {
		  //this works as number1 is defined in super class
		  val v1 = number1
	  }
	}
}
