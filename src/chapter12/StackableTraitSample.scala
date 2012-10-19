/**
 *
 */
package chapter12
import scala.collection.mutable.ArrayBuffer
import java.util.ArrayList

/**
 * @author Amol
 *
 */
object StackableTraitSample {

  def main(args: Array[String]): Unit = {
    //We start by defining a simple instance of MyIntQueueImpl
    def queue1 = new MyIntQueueImpl
    println("Adding -1 to queue")
    queue1.put(-1)
    println(queue1.queue)
    println("Adding 0 to queue")
    queue1.put(0)
    println(queue1.queue)
    println("Adding 1 to queue")
    queue1.put(1)
    println(queue1.queue)
    println("Getting element returned " + queue1.get())
//    println("Getting element returned " + queue1.get())
//    println("Getting element returned " + queue1.get())

  }

}

/**
 * The abstract Queue class that defines two methods, one to put
 * and int and get an int
 */
abstract class MyIntQueue {
  def put(num:Int)
  def get():Int
}

/**
 * The implementation that extends from MyIntQueue and implements the
 * Queues put and get methods
 */
class MyIntQueueImpl extends MyIntQueue {

	val queue = new scala.collection.mutable.ArrayBuffer[Int]

	def put(num:Int) = {queue += num}

	//No check for IOB
	def get():Int = queue.remove(0)
}