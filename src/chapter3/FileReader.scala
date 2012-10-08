/**
 *
 */
package chapter3
import scala.io.Source

/**
 * @author Amol
 *
 */
object FileReader {

  def main(args: Array[String]) {
	val fileContent = Source.fromFile("src/chapter3/FileReader.scala").getLines().toList
	val maxLine = fileContent.reduceLeft((a,b) => if(a.length() > b.length())a else b)
	println("Max Line Length is " + maxLine.length() + ", max line is " + maxLine)
  }
}