/**
 *
 */
package chapter8
import scala.io.Source
import java.io.File

/**
 * @author Amol
 *
 */
object FunctionSample {

  /**
   * Sample function that has an inner function which has access to the outer function's
   * parameters
   *
   */
  def processFile(filename: String, width:Int) {
    val source = Source.fromFile("src" + File.separator	+ "chapter8" + File.separator + filename)

    def processLine(line:String) {
      if(line.size > width) {
        println(line.size + ": " + filename + ": " + line)
      }
    }

    for(line <- source.getLines())
      processLine(line)
  }

  def main(args: Array[String]) {
	  processFile("FunctionSample.scala", 80)

	  //Sample for the first class function
	  val func = (x:Int) => x + 1
	  println("func(10): " + func(10))
	  println("func(20): " + func(20))
	  //------------------------------------

	  //Sample for the short hand function

	  val nums = Array(1, 2, 4, -1, 3, -3, -5)
	  val filtered = nums.filter(x => x > 0)
	  print("Filtered list is ")
	  print(filtered.mkString(" ") + "\n")

	  //Sample for placeholder parameters

	  val add = (_:Int) + (_:Int)
	  println("add(5, 10) is " + add(5, 10))

	  //define a sum function for 3 numbers

	  def sum(a:Int, b:Int, c:Int):Int = {
	    a + b + c
	  }

	  //Defines the parameter list as the placeholder with all the three params provided at runtime
	  val a = sum _
	  println("sum(1, 2, 3): " + sum(1, 2, 3))


	  val b = sum(1, _:Int, 3)
	  println("b(4): " + b(4))
	  println("b(10): " + b(10))

	  //closure sample
	  val step = 5;	//semi colon needed here explicitly
	  var innerClosure:(Int => Int) = null;
	  {
	    val step = 10
	    innerClosure = (x:Int) => x + step
	  }
	  val outerClosure = (x:Int) => x + step
	  //notice how the step value has a different value in the closure
	  //For the inner closure the value of step is 10, the value in the inner block
	  //where as for the outerClosure the value of step is 5
	  println("innerClosure(5): " + innerClosure(5))
	  println("outerClosure(5): " + outerClosure(5))

	  // Var args sample

	  //lets define a simple function that accepts multiple string args

	  def stringVarArgsFunc(vals:String*):String = {
	    vals mkString " "
	  }

	  println("""stringVarArgsFunc("Param1", "Param2", "Param3") is """ + stringVarArgsFunc("Param1", "Param2", "Param3"))

	  //Sample for passing String array as a paremeter to the var args function
	  val strArray = Array("Param1", "Param2", "Param3")

	  //notice  how the type of the array is to be mentioned
	  println("stringVarArgsFunc(strArray) is " + stringVarArgsFunc(strArray:_*))

	  //Similarly it is to be done for the list
	  val strList = List("Param1", "Param2")
	  println("stringVarArgsFunc(strList) is " + stringVarArgsFunc(strList:_*))

	  //Named parameters sample, watch how the order of the parameters are reversed
	  //and yet works with named parameters

	  def speed(distance:Float, time:Float):Float = {
	    distance/time
	  }
	  //watch how the parameters are passed to the function
	  println("Speed with a distance of 100km in 2 hrs is " + speed(time = 2.0f, distance = 100.0f) + " kmph")




  }
}