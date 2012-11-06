/**
 *
 */
package chapter15

/**
 * The test class that uses pattern matching to
 * @author Amol
 *
 */
object OperatorsSamples {

  def main(args: Array[String]): Unit = {
	println("Evaluating expression Const(1) gives " + simplifyTop(Const(1)))
	println("""Evaluating expression UnOpr("-", UnOpr("-", Const(1)) gives """ +
	    simplifyTop(UnOpr("-", UnOpr("-", Const(1)))))

	println("""Evaluating expression BiOpr("+", Const(3), Const(0)) gives """ +
	    simplifyTop(BiOpr("+", Const(3), Const(0))))
  }

  /**
   * A method that matches some simple pattern and returns a result for some simple
   * expressions like negative or a negative number, a number added to 0 gives the same number
   * or a number multiplied with 1 gives the same number. This is not the full blown expression evaluator
   *
   */
  def simplifyTop(expr:Expr):Expr = expr match {
    case UnOpr("-", UnOpr("-", e)) => e
    case BiOpr("+", e, Const(0)) => e
    case BiOpr("*", e, Const(1)) => e
    case _ => expr
  }
}

abstract class Expr
case class Const(num:Int) extends Expr
case class Var(variable:String) extends Expr
case class UnOpr(operator:String, exp:Expr) extends Expr
case class BiOpr(operator:String, left:Expr, right:Expr) extends Expr
