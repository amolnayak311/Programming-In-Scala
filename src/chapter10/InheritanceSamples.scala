/**
 *
 */
package chapter10

import chapter10.Element.elem

/**
 * @author Amol
 *
 */
object InheritanceSamples {

  def main(args: Array[String]): Unit = {
    var e: Element = new ArrayElement(Array("First", "Second"))
    println("ArrayElement's contents are " + e.contents.mkString(" "))
    println("ArrayElement's height is " + e.height)
    println("ArrayElement's width is " + e.width)
    println() //Recommended to invoke with a () as this does a IO operation.
    e = new ArrayElement2(Array("First", "Second", "Third"))
    //contents is a field and not a method in this instance, notice how it is transparent to the client
    println("ArrayElement2's contents are " + e.contents.mkString(" "))
    println("ArrayElement2's height is " + e.height)
    println("ArrayElement2's width is " + e.width)
    println()
    e = new LineElement("SomeElement")
    println("StringElement's contents are " + e.contents.mkString(" "))
    println("StringElement's height is " + e.height)
    println("StringElement's width is " + e.width)
    println()
    //define one Element with three Strings
    val elem1 = new ArrayElement(Array("Cont1", "Cont2"))
    val elem2 = new ArrayElement(Array("Cont3", "Cont4"))
    val above = elem1 above elem2
    println("above is \n" + above)
    println()
    val beside = elem1 beside elem2
    println("beside is \n" + beside)

    println("\nPrinting the uniform element")
    val uniElem = new UniformElement('c', 4, 6)
    println(uniElem)

    val lineElem = elem("Some String")


  }

}