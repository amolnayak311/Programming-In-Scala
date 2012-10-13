package chapter10

/**
 * A subclass of ArrayElement that demonstrates the concept of passing the
 * parameters to the Super class's constructors
 *
 * @author Amol
 */
class LineElement(s:String) extends ArrayElement(Array(s)) {

  /**
   * Override the height method that always returns 1
   */
  override def height = 1

  /**
   * Override the width method with a variable, notice this has val and def
   */
  override val width = s.length
}