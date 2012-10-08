/**
 *
 */
package chapter5

/**
 * @author Amol
 *
 */
object StringAssignment {

  def main(args: Array[String]) {
	  val someStringWithQuotes = "Some String With \"Quotes\""
	  println(someStringWithQuotes)

	  println("""Some String beginning with three
	      					quotes and no strip margin""")
	  println("""|Some String beginning with three
	      				|quotes and with strip margin""".stripMargin)
  }
}