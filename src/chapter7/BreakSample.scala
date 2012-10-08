/**
 *
 */
package chapter7

import scala.util.control.Breaks._
/**
 * break and continue are not favored in scala and are supposed to be ignored
 * We have one sample here that will contain an array of some Strings, and
 * three implementations that would be finding the first instance of the String
 * ending with .scala from the given index
 *
 * @author Amol
 *
 */
object BreakSample {

  val TestArray = Array("Some", "Strings", "Containing", "-", "And", "Test.scala", "Name")

  def main(args: Array[String]) {
	  val loopResult = withLoops
	  val recurResult = withRecursion
	  val breakableResult = withBreakable

	  val message = "loopResult: %d, recurResult: %d, breakableResult: %d"
	    .format(loopResult, recurResult, breakableResult)
	  println(message)
  }

  def withLoops:Int = {
    var index = -1
    var i = 0
    var found = false
    while(i < TestArray.length && !found) {
    	if(!TestArray(i).startsWith("-")) {
    		if(TestArray(i).endsWith(".scala")) {
    		  found = true
    		  index = i
    		}
    	}
    	i += 1
    }
    index
  }

  def withRecursion:Int = {
    def searchWord(index:Int):Int = {
    	if(index >= TestArray.length) -1
    	else if(TestArray(index).endsWith(".scala")) index
    	else searchWord(index + 1)
    }
    searchWord(0)
  }

  def withBreakable:Int = {
    var index = -1
    breakable {
      var i = 0
      while(i < TestArray.length) {
    	if(!TestArray(i).startsWith("-")) {
    		if(TestArray(i).endsWith(".scala")) {
    		  index = i
    		  break;
    		}
    	}
    	i += 1
      }
    }
    index
  }
}