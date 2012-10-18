/**
 * @author Amol
 *
 */

package bobsrockets {
	package navigation {
	  class Navigator {
	    //this class is bobsrockets.navigation.Navigator
		val map = new StarMap
		//this works as
	  }

	  //This class is bobsrockets.navigation
	  class StarMap
	}

	class Ship {
	  //This works in this form of packaging.
	  //No need to have bobsrocket.navigation.Navigator as Ship
	  //it is present in bobsrocket, so the packaging is now relative

	  val nav = new navigation.Navigator;

	  //Now comes an interesting thing.
	  //I Want to use the class navigation.Navigator. But
	  //just specifying navigation.Navigator here will use the class
	  //bobsrockets.navigation.Navigator and will be same as nav.

	  // to use navigation.Navigator we have to use

	  val nav1 = new _root_.navigation.Navigator

	  //Now nav and nav1 refer to different classes
	}

	package fleets {
	  class Fleet {
	    //Now this works as Ship is present in a parent package of Fleet class.
	    //no need to say bobsrocket.Ship
	    val ship = new Ship

	    //This however is present in a package navigation which is at the
	    //same level as fleets, hence we need to give the complete
	    //package.
	    val map = new bobsrockets.navigation.StarMap
	    //we can also access the class defined in a completely different package
	    //from the root like this.
	    val out = new outermost.InOutermost
	  }
	}
}

package navigation {
  class Navigator
}
package outermost {
  class InOutermost
}

//We can have multiple package definitions for the same package name
package outermost {
	package innermost {
	  class AnotherInnerClass {
		  //Even though the class InOutermost is defined in another
		  //outermost package definition and not the immediate parent of this package
		  //We still can access it.
		  val inOuter = new InOutermost
	  }
	}
}

