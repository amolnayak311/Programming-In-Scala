/**
 *
 */
package chapter15

import math.{E, Pi}

/**
 * The sample demonstrates the types of patterns we can have in a case
 * @author Amol
 *
 */
object PatternsSample {
	def main(args: Array[String]) {
	  simpleMatcher(1)
	  simpleMatcher(2)
	  simpleMatcher(TestCClass("", ""))
	  simpleMatcher(TestAnotherCClass("First", "Second"))

	  variableMatcher(120)

	  constantMatcher(E)
	  constantMatcher(Pi)
	  constantMatcher(1)

	  pitfallMatcher(E)

	  variableAssignedMatcher(E)
	  variableAssignedMatcher(Pi)

	  constructorMatcher(BiOpr("+", Const(1), Const(3)))
	  constructorMatcher(BiOpr("+", Const(1), Const(1)))
	  constructorMatcher(Const(1))


	  sequencePatternMatcher(List(1, 2, 3));
	  sequencePatternMatcher(List(0, 2, 3));
	  sequencePatternMatcher(List(0, 2, 3, 4, 5));


	  tuplePatternMatcher((1, 2, 3));
	  tuplePatternMatcher((1, 2, 3, 1));

	  typePatternMatcher(Map("1" -> "av"))
	  typePatternMatcher(List(1, 2, 3))
	  typePatternMatcher("Some String")
	  typePatternMatcher(1)

	  variableMatcherBinder(Const(1))
	  variableMatcherBinder(UnOpr("-", Const(1)))


	  patternGuardMatcher(BiOpr("+", Const(1), Const(2)))
	  patternGuardMatcher(BiOpr("+", Const(1), Const(1)))

	}

	/**
	 * The matcher that matches the given pattern with a list of patterns
	 */
	def patternGuardMatcher(pat:Any) {
	  pat match {
	    //This will match the BiOpr only if x == y, the guard ensures that
	    case BiOpr("+", x, y) if x == y => printf("BiOpr calles when x == y, x and y are %s %s respectively\n", x, y);
	    case _ => println("Matched something else")
	  }
	}

	/**
	 * An example of variable binding
	 */
	def variableMatcherBinder(pattern:Any) {
		pattern match {
		  //Below will bind the value of the pattern passed to variable c
		  case c @ Const(_) => println("Const is " + c)

		  //Below will bind the value of the pattern passed to variable u
		  case u @ UnOpr("-", Const(_)) => println("Unopr os " + u)

		  //Default expression un
		  case un => println("Unknown value " + un)
		}
	}



	/**
	 * A matcher that will match the object to a fixed type and will invoke some method on that object
	 * accordingly.
	 */
	def typePatternMatcher(anyType:Any) {
	  anyType match {
	    case s:String => println("Type is a String of length " + s.length)
	    case m:Map[_, _] => println("Type is a map of size " + m.size)
	    case l:List[_] => println("Got a list of size " + l.size)
	    case _ => println("Got a unknown type")
	  }
	}

	def tuplePatternMatcher(tup:Any) {
	  tup match {
	    //This is a case where a passed value is checked if this is a tuple of 1, 2, 3
	    case (1, 2, 3) => println("Found a tuple of 1, 2, 3")
	    case _ => println("Found something that didnt match")
	  }
	}
	/**
	 * The matcher that matches a sequence
	 */
	def sequencePatternMatcher(any:Any) {

	  any match {
	    //A list containing 3 elements 1, 2 and 3
	    case List(1, 2, 3) => println("Got a list of 3 elements, 1, 2 and 3")
	    //A list of 3 elements starting with 0
	    case List(0, _ , _) => println("Got a list of 3 elements starting with 0")
	    //A list starting with 0 and containing any number of elements afterwards
	    //Note that this is placed below (0, _, _) else its would have matched that as well
	    case List(0, _*) => println("Got a list of n elements starting with 0")
	    //Something that didnt match
	    case some => println("Got an element which didnt match any pattern, found " + some)
	  }
	}


	/**
	 * Constructor matcher goes in recursively to match the expression
	 */
	def constructorMatcher(exp:Expr) {
	  exp match {
	    //Note that in this case not only the BiOpr is matched but also the three parameters
	    //matched
	    case BiOpr("+", Const(1), Const(3)) => println("You want to do 1 + 3, well its 4")
	    case exp => println("Invoked " + exp)
	  }
	}


	/**
	 * This is an example of matching to a value assigned to a variable, the variable will not be
	 * treated as a wildcard variable
	 */
	def variableAssignedMatcher(a:Any) {
	  val pi = Pi
	  a match {
	    //This will match to the value assigned in the variable pi outside the block
	    case `pi` => println("Matched pi: " +  pi)
	    //This is a wildcard where the value will be matched to any wildcard variable
	    case any => println("Matched something else with value " + any)
	  }
	}

	/**
	 * A matcher that will assign a constant to a variable and will attempt to
	 * match that, lookout for such matchers as this will not yield what you might
	 * expect at the first look
	 *
	 */
	def pitfallMatcher(a:Any) {

	  var pi = Pi
	  a match {
	    //Below is as good as a wildcard matcher where the value is bound to the variable pi
	    //it has nothing to do with the pi variable thats defined outside the match block
	    case pi => println("Matched Pi value is " + pi)
	  }
	}

	/**
	 * A matcher that will match constants Math.Pi and Math.E
	 */
	def constantMatcher(a:Any) {
	  a match {
	    //This is the
	    case Pi => println("Matched Pi")
	    case E => println("Matched E")
	    case _ => println("Didnt match anything")
	  }
	}

	/**
	 *A matcher that matches and binds the value to a variable
	 */
	private def variableMatcher(a:Any) {
	  a match {
	    //Similar to wildcard pattern _, but the value is bound to the variable now
	    case variable => println("Got value as " + variable)
	    //uncommenting below gives a warning for unreachable code
	    //case _ => println("With wild card")
	  }
	}

	/**
	 * A matcher that matches the value to a couple of case classes, constant value and a wildcard
	 */
	private def simpleMatcher(in:Any) {
		in match {
		  //Notice how we have used wild cards as the class's parameters as we are not
		  //really interested in them and not using them
		  case TestCClass(_, _) => println("Got TestCClass")

		  //On other hand look at how this is done, since we are interested in the first parameter we bind that
		  //to a variable p1 and the second one is ignored by using an _ as the placeholder
		  case TestAnotherCClass(p1, _) => println("Got TestAnotherCClass with the first parameter as " + p1)

		  //This one is a case of matching a constant "1"
		  case 1 => println("Got 1")

		  //Anything else not handled above will be matched here with the _ used to match anything,
		  //In absense of this a MatcherError will be thrown if not match was found above
		  case _ => println("Got something that wasn't thought of")

		}
	}

}

case class TestCClass(p1:String, p2:String)
case class TestAnotherCClass(p1:String, p2:String)