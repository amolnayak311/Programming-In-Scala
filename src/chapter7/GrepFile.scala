/**
 *
 */
package chapter7
import java.io.File
import scala.io.Source

/**
 * Utility class that will be used to find all the .scala files in the chapter7
 * directory then find the given pattern in the them
 *
 * @author Amol
 *
 */
object GrepFile {

  val BaseDirectory = "src" + File.separator + "chapter7"
  def main(args: Array[String]) {
	  grep(".*grep.*")
  }

  def grep(pattern:String) {
	for(
	    file <- new File(BaseDirectory).listFiles
	    if file.getName.endsWith(".scala");
	    line <- Source.fromFile(file).getLines()
	    if line.matches(pattern)
	)
	  println(line + " in file " + file)

  }


}