package day6.usingfinal;

final class Finalclass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

//can't create child classes from Final class, Ex: String, Wrapper Classes, System, Scanner, Number are Final classes


public class Finalclassdemo {
	public static void main(String[] args) {
		// Create the object of final class
		Finalclass f1 = new Finalclass(); // Call show() method using object reference variable ab.
		f1.show();
	}
}
