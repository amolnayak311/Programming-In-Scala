package chapter5;


public class ScalaInvoker {

	public static void main(String[] args) {
		Person person = new Person("Name", 28, Gender.MALE);
		System.out.println("Name: " + person.name());
		System.out.println("Age: " + person.age());
		System.out.println(person);
	}
}
