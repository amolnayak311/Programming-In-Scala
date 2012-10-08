/**
 *
 */
package chapter7

/**
 * @author Amol
 *
 */
object Matchers {

  def main(args: Array[String]) {
	  //matches the Strings in the array and prints the companions
	  val items = Array("Salt", "Egg", "Fish", "Sugar")
	  val results:Array[String] = new Array(items.size)
	  var i = 0
	  items.foreach(arg => {results(i) = findCompanion(arg); i+= 1})
	  for(result <- results) println(result)
  }

  def findCompanion(firstOne:String):String = {
    firstOne match {
      case "Salt" => "Salt And Pepper"
      case "Egg" => "Egg and Bacon"
      case "Fish" => "Fish and Chips"
      case _ => firstOne + " and duh??"
    }
  }
}