package TypeOfInheritance;
class Employee {
	float salary = 34534 * 12;
}
// One parent and one child class is single inheritance .
public class Single extends Employee {
	float bonus = 3000 * 6;

	public static void main(String args[]) {
		Single obj = new Single();
		System.out.println("Total salary credited: " + obj.salary);
		System.out.println("Bonus of six months: " + obj.bonus);
	}
}

/* 1-> Inheritance provides the re-usability of code especially when there is a large scale
        of code to reuse. 
 * 2-> It also establishes the relationship between different classes that is known as 
       a Is-a relationship. 
 * 3-> We can also use it if we want to achieve method overriding.
 * 4-> Constructor / Static method cannot be inherited in Java.
 * 5-> Private members do not get inherited in Java.
 * 6-> Cyclic inheritance is not permitted in Java.
 * 7-> Assign parent reference to child objects.
 * 8-> Constructors get executed because of super() present in the constructor.
 * 9-> single inheritance, a sub-class is derived from only one super class. It inherits 
       the properties and behavior of a single-parent class.Sometimes it is also known as 
       simple inheritance.
 * 10-> Classes are interdependent, and changes in one class can lead to changes
        in the other. Tight coupling */
