package SetDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		// Insertion order is maintained
		LinkedHashSet<Integer> l = new LinkedHashSet<>();
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(2);
		l.add(11);
		l.add(14);
		l.add(27);
		l.add(19);
		l.add(null);
		System.out.println(l.isEmpty());
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.contains(27));
		System.out.println(l.remove(2));
		System.out.println(l.removeLast());

		System.out.println(l);

		Iterator<Integer> ii = l.iterator();
		while (ii.hasNext()) {
			System.out.println(ii.next());
		}

	}
}
