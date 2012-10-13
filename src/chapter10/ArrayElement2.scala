/**
 *
 */
package chapter10

/**
 * A variation of ArrayElement class that extends Element.
 *
 * Note that unlike the ArrayElement class we are not implementing the contents
 * method instead we are using an immutable variable with the same name
 * Any client accessing the contents attribute of Element will not be aware whether
 * it is accessing the method or the variable.
 *
 *  In scala, unlike java since variables and methods share the same namespace we cannot
 *  have a variable and a method with the same name in a class.
 *  fields, methods, packages and singleton objects all share the same namespace in scala
 *
 * @author Amol
 *
 */
class ArrayElement2(val contents:Array[String]) extends Element