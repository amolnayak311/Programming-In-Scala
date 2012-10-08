/**
 *
 */
package chapter9
import java.io.File

/**
 * @author Amol
 *
 */
object FileMatcher {

  private val filesInDir =
    new File("src" + File.separator + "chapter9").listFiles

  /**
   * This method accept a function as a parameter. This function accepts one String
   * parameter and returns a Boolean value.
   * The passed matcher method is invoked with the file name as the parameter
   * in the filter of the for loop
   *
   */
  private def fileMatching(matcher: String => Boolean) =
    for (file <- filesInDir if matcher(file.getName))
      yield file

  /**
   * The method checks if the file name ends with the given string value
   * This invokes the fileMatching method with a method with the first parameter as the
   * placeholder, which is the string value of the file name and checks if the
   * file name ends with the given string pattern
   */
  def fileEnding(endingName: String) = fileMatching(_.endsWith(endingName))

  /**
   * Similar to above method but invokes contains instead of endsWith
   */
  def fileContains(containsName: String) = fileMatching(_.contains(containsName))

  /**
   * Test the methods
   */
  def main(args: Array[String]) {
    	val files = fileEnding(".scala")
    	println("Files ending with .scala are " + files.mkString(" "))
    	val filesContaining = fileContains("Matcher")
    	println("Files containing Matcher are " + filesContaining.mkString(" "))
  }
}