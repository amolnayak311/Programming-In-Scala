/**
 *
 */
package chapter3

/**
 * @author Amol
 *
 */
object ArrayPrinting {

  def main(args: Array[String]) {
	  val array = Array("Hello", "How", "Are", "You")

	  //imperative style

	  printArrayImperative(array)
	  printArrayFunctional1(array)
	  printArrayFunctional2(array)
	  println(printArrayFunctional3(array))
  }

  def printArrayImperative(array:Array[String]) = {
	  println("\n\nPrinting from imperative style func")
	  var i = 0
	  while(i < array.length) {
	    println(array(i))
	    i += 1
	  }
  }

  def printArrayFunctional1(array:Array[String]) = {
	  println("\n\nPrinting from functional style func1")
	  for(elem <- array) {
	    println(elem)
	  }
  }

  def printArrayFunctional2(array:Array[String]) = {
    println("\n\nPrinting from functional style func2")
	  array foreach println
  }

  def printArrayFunctional3(array:Array[String]):String = {
    println("\n\nPrinting from functional style func3")
    array.mkString("\n")
  }
}