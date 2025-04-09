package ListDemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	/*
	 * When you frequently add or remove elements from the beginning or end of the
	 * list. When memory efficiency is not a major concern, and you need quick
	 * insertions and deletions. If you need to use it as a Queue or Deque.
	 */
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		// Adding elements to the linked list
		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");
		ll.add("E");
		ll.add("F");
		ll.add("G");
		ll.add("H");
		ll.add("I");
		ll.add("J");
		ll.add("K");

		ListIterator<String> ii = ll.listIterator(); // ListIterator Only Appicable for List Class .
		while (ii.hasNext()) {
			System.out.println(ii.next());
		}
		System.out.println(ll);
	}
}
