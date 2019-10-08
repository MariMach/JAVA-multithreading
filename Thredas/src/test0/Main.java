package test0;

public class Main {
	public static void main(String[] args) {
		Ford ford = new Ford();
		
		Person person = new Person("Mariam", ford);
		person.start();
		
		Person person0 = new Person("Smiks", ford);
		person0.start();
	}
}
