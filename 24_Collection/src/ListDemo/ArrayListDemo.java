package ListDemo;

import java.util.ArrayList;
/* ArrayList is Underlined data Structure Resizable Array or Growable Array.
 * ArrayList Duplicates Are Allowed.
 * Insertion Order is Preserved.
 * Heterogeneous objects are allowed.
 * Null insertion is possible
 * Not Thread safe
 */
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		Collections.synchronizedCollection(fruits); // for making thread safe
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		// Print the entire ArrayList
		System.out.println("Fruits: " + fruits);

		// Access an element by index

		String fruitAtIndex1 = fruits.get(1);
		System.out.println("Fruit at index 1: " + fruitAtIndex1);

		// Modify an element at a specific index
		fruits.set(1, "Blueberry");
		System.out.println("After modification: " + fruits);

		// Remove an element by index
		fruits.remove(0);
		System.out.println("After removal: " + fruits);

		// Check if the ArrayList contains an element
		boolean containsBanana = fruits.contains("Banana");
		System.out.println("Contains Banana: " + containsBanana);

		// Get the size of the ArrayList
		int size = fruits.size();
		System.out.println("Size of ArrayList: " + size);

	}
}
