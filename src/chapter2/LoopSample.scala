/**
 *
 */
package chapter2

/**
 * @author Amol
 *
 */
object LoopSample {

  def main(args: Array[String]) {
    println("Some conventional (imperative) style while loop")
	 var i= 0
	 while(i < args.length) {
	   print(args(i) + " ")
	   i += 1
	 }

    println("\n\nusing the functional style loop, style one")
    args foreach((arg: String) => {print(arg + " ")})

    println("\n\nusing the functional style loop, style two")
    args foreach(arg => print(arg + " "))

    println("\n\nusing the functional style loop, style three, prints without space")
    args foreach(print)

    println("\n\nUsing for loop ")
    for(arg <- args) {
      print(arg + " ")
    }

    //The below sample will have an array of texts and will print each
    //of them in upper case
    println("\n\nConvert each of the content into upper case and add to new array")
    println("input array is")
    var input = Array("Text1", "Text2", "Text3");
    input foreach(arg => print(arg + " "))
    var output = new Array[String](input.length)
    i = 0;
    input foreach (arg => {output(i) = arg.toUpperCase; i += 1})
    println("\n\nPrinting output array")
    output foreach(arg => print(arg + " "))


  }
}