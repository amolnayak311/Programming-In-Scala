/**
 *
 */
package chapter10

/**
 * An abstract class for all the elements
 * @author Amol
 *
 */
abstract class Element {

  /**
   * This below is not a variable but a method (as we see def and not val or var)
   * This has no body ans hence an abstract. No need to have the abstract keywork
   * as in java as it is not supported in scala for methods.
   */
  def contents:Array[String]

  //concrete implementations for the height and width

  /*
   * The below implementations are examples of parameterless functions.
   * This is the recommended way of invoking of defining a method in scala
   * whenever it doesn't accept any parameters. () how should be used for methods
   * that have side effects, that is change the state of the immutable attributes.
   *
   * invoking methods without () also supports uniform access principal which says
   * that the invoking should not be aware whether it access the variable or the method
   *
   * recommended to use () is the method performs IO, reassigns mutable state or reads
   * vars other that the receiver's object
   */

  /**
   *Gets the number of elements in the contents array
   */
  def height:Int = contents.length

  /**
   * Gets the width of the first element in the contents else 0 if no elements present
   */
  def width:Int = if(height == 0) 0 else contents(0).length

  /**
   * The method concats the contents of this element and that element
   */
  def above(that:Element):Element =  new ArrayElement(contents ++ that.contents)

  /**
   * This method puts the the current element besides another element
   * e.g If the two contents are (Cont1, Cont2) and (Cont3, Cont4) then the
   * result is (Cont1Cont3, Cont2Cont4)
   */
  def beside(that:Element):Element =
    new ArrayElement(
    		for((x,y) <- this.contents zip that.contents) yield x + y
    )

  /**
   * The overridden toString that prints each element to a new line
   */
  override def toString:String = contents mkString "\n"
}
object Element {

  /**
   * Creates a new ArrayElement
   */
  def elem(arr:Array[String]):Element = new ArrayElement(arr)

  /**
   *Creates a new UniformElement
   */
  def elem(c:Char, width:Int, height:Int):Element = new UniformElement(c, width, height)

  /**
   * Creates a new LineElement
   */
  def elem(line:String):Element = new LineElement(line)


}