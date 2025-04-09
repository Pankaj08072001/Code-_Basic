package AbstractClass;

// Abstract class can't create object directly.Also support IS-A relation & Tigtly-cuppling 
abstract class Animal {
	// Abstract method (does not have a body)
	public abstract void animalSound();

	// Regular method or concrete method
	public void sleep() {
		System.out.println("Zzz");
	}
}

// Subclass (inherit from Animal)
class Pig extends Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
}

public class AnimalL {
	public static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
	}
}
