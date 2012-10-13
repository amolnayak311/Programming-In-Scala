/**
 *
 */
package chapter10

/**
 * This program will demonstrate some methods in the array class
 * that will be used in the operators on Element
 *
 * @author Amol
 *
 */
object ArrayOperators {

  def main(args: Array[String]): Unit = {
    val arr1 = Array("First1", "Second1", "Third1")
    val arr2 = Array("First2", "Second2")
    println("Concat arr1 and arr2 using the ++ operator")
    val arr3 = arr1 ++ arr2
    println(arr3 mkString " ")
    println()
    val arr1ziparr2 = arr1 zip arr2
    println("arr1 zip arr2 's  type is " + arr1ziparr2.getClass)
    println("Elements in a tuple are ")
    for((a, b) <- arr1ziparr2)
      println("(%s, %s)".format(a,b))
  }
}