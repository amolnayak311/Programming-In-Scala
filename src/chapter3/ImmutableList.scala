/**
 *
 */
package chapter3

/**
 * @author Amol
 *
 */
object ImmutableList {

  def main(args: Array[String]) {
	  var list1 = List(1, 2, 3)
	  var list2 = List(4, 5, 6)

	  //now when we do this, the method gets invoked on list2 and not in list1
	  // as the method name ends with :
	  var list3 = list1 ::: list2
	  println("list1 is " + list1 + " and list2 is " + list2)
	  println("list3 is " + list3)
	  //What exactly happens with this invocation is that the contents of list 1
	  //are prepended to the elements of list2 giving a new list with 6 elements
	  //with elements of list1 followed by elements of list2

	  var list4 = list1 :: list2
	  println("list1 is " + list1 + " and list2 is " + list2)
	  println("list4 is " + list4)
	  //The :: is different that the ::: i which the left operand can be of any type
	  //, thus will return a list with the first element as the left operand with rest
	  //of the elements from the right operand

	  var list5 = 3 :: list2
	  println("list2 is " + list2)
	  println("list4 is " + list5)

	  var list6 = 1 :: 2 :: 3 :: Nil
	  println("list6 is " + list6)


  }


}