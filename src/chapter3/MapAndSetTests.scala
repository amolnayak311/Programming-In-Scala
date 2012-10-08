/**
 *
 */
package chapter3


/**
 * @author Amol
 *
 */
object MapAndSetTests {

  def main(args: Array[String]) {

	  var immutableSet = Set(1,2,3,4)
	  println("immutableSet is " + immutableSet)
	  var copyImmutable = immutableSet
	  println("Assigned to copy and added 5 to the set")
	  copyImmutable += 5
	  println("immutableSet is " + immutableSet + ", copy is " + copyImmutable)

	  //Using mutable set
	  var mutableSet = scala.collection.mutable.Set(1,2,3,4)
	  println("mutableSet is " + mutableSet)
	  var copyMutable = mutableSet
	  println("Assigned to copy and added 5 to the set")
	  copyMutable += 5
	  println("mutableSet is " + mutableSet + ", copyMutable is " + copyMutable)

	  //similarly for a immutable set
	  var immutableMap = Map("Key1" -> "Value1", "Key2" -> "Value2")
	  val copyMap = immutableMap
	  immutableMap += ("Key3" -> "Value3")
	  println("Copy map is " + copyMap + ", imutableMap is " + immutableMap)

	  //Now for mutable map
	  var mutableMap = scala.collection.mutable.Map("Key1" -> "Value1", "Key2" -> "Value2")
	  val copyMutableMap = mutableMap
	  mutableMap += ("Key3" -> "Value3")
	  println("copyMap " + copyMutableMap + ", mutableMap is " + mutableMap)

  }
}