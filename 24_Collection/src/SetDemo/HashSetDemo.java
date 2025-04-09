package SetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		// Insertion order is not Maintained 
		// All Set Interface and its implements classes are not allow duplicate if you can add 
		// explicitly then method simply return false .
		// null is allow but only one time 
		HashSet<Integer> h = new HashSet<>();
		h.add(5);
		h.add(10);
		h.add(15);
		h.add(20);
		h.add(25);
		h.add(null);
		h.add(null);
		h.add(5); // return false because set don't allow duplicate. 
		System.out.println(h);
		//h.remove(5);
		System.out.println(h.contains(25));
		Iterator<Integer> ii = h.iterator();
		while (ii.hasNext()) {
			System.out.println(ii.next());
		}
		// System.out.println(ii);
	}
}
