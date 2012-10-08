/**
 *
 */
package chapter4
import scala.collection.mutable.WeakHashMap

/**
 * @author Amol
 *
 */
class ChecksumAccumulator {

  var sum = 0

  def add(b: Byte) = sum += b
  def checksum() = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {

  var cache = WeakHashMap[String,Int]()

  def calculate(s:String): Int = {
	    if(cache containsKey s)
	      cache(s)
	    else {
	    	val acc = new ChecksumAccumulator
	    	for(c <- s) {
	    	  acc add c.toByte
	    	}
	    	val cs = acc.checksum()
	    	cache += (s -> cs)
	    	cs
	    }
   }
}