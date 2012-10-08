/**
 *
 */
package chapter7

/**
 * @author Amol
 *
 */
object MultiTableSample {

  def main(args: Array[String]) {
	  println("\n4 X 4 table is \n" + makeTable(4, 4))
	  println("\n5 X 4 table is \n" + makeTable(5, 4))
	  println("\n10 X 10 table is \n" + makeTable(10, 10))
  }


  def makeTable(numRows:Int, numCols:Int):String = {
    val result =
    	for(row <- 1 to numRows)
    		yield makeRow(row, numCols)
    result mkString "\n\n"
  }

  def makeRow(row:Int, numCols:Int):String = {
    val col =
    	for( col <- 1 to numCols)
    	  yield row * col
    col mkString "\t"
  }
}