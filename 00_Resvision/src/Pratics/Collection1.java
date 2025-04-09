package Pratics;

import java.util.ArrayList;

public class Collection1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.set(3, "pankaj");
		System.out.println(al.size());
		System.out.println(al.get(3));
		
		al.addFirst("Muksan");
		al.addLast("Yadav");
		System.out.println(al);
		al.remove(5);
		
		//al.clone();
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
		
		
	}
}
