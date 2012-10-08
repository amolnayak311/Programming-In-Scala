/**
 *
 */
package chapter7
import java.io.File

/**
 * @author Amol
 *
 */
object ForWithFilters extends Application {

	println("Printing files without filter\n")
	for(file <- new File(".").listFiles)
		println(file)

	println("\n\nPrinting files with filter\n")
	for(file <- new File(".").listFiles if file.isFile)
	  println(file)

}