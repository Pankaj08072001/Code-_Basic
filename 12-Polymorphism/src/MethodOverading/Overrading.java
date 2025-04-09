package MethodOverading;
/*Run Time Polymorphism :- Run time Polymorphism is also known as dynamic method dispatch and
  it is implemented by the method overriding.
  
 * Overriding is not possible in same class .
 * more restrictive  modifier (private --> default --> protected --> public)
 * Overriding rules if u declare method default then in time overriding u can use public and
 * protected modifier 
 */
	class Vehicle {
	void displayInfo() {
	    System.out.println("Some vehicles are there.");
	  }
	}

	class Car extends Vehicle {
	  // Method overriding
	  protected void displayInfo() {
      System.out.println("I have a Car.");
     }
	}

	class Bike extends Vehicle {
     // Method overriding
	protected void displayInfo() {
    System.out.println("I have a Bike.");
  }
}

public class Overrading  {
  public static void main(String[] args) {
    Vehicle v1 = new Car();   // Up-casting
    Vehicle v2 = new Bike();  // Up-casting

    // Calling the overridden displayInfo() method of Car class
    v1.displayInfo();

    // Calling the overridden displayInfo() method of Bike class
    v2.displayInfo();
  }
}