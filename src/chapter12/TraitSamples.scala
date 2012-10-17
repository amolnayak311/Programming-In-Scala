/**
 *
 */
package chapter12

/**
 * @author Amol
 *
 */
object TraitSamples {

  def main(args: Array[String]) {
	  def frog = new Frog
	  println("Instance is " + frog);
	  print("Calling philosophise on frog ")
	  frog.philosophise
	  println()
	  def dog = new Dog
	  println("Instance is " + dog);
	  print("Calling philosophise on dog ")
	  dog.philosophise


  }
}

//define classes

class Animal

class Frog extends Philosophical {
  override def toString = "I am a frog"
}

class Dog extends Animal with Philosophical {

  override def toString = "I'm a Dog"

  override def philosophise() {println("Some overridden method now")}
}