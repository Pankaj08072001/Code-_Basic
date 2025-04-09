package ListDemo;

import java.util.Enumeration;
//import java.util.Stack;
import java.util.Vector;

public class VectorAndStack {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		v1.add(5);
		v1.add(10);
		v1.add(15);
		v1.add(20);
		v1.add(25);
		v1.add(30);
		v1.add(35);
		v1.add(40);
		v1.add(45);
		v1.add(50);
		v1.add(2, 8);
		v1.addFirst(0);
		Enumeration  <Integer> ii = v1.elements();  // only for legacy class 
		while(ii.hasMoreElements()) {
			System.out.println(ii.nextElement());
		}
		System.out.println(v1);
		
//		Stack<String> s1 = new Stack<>();
//		s1.push("Pankaj");
//		s1.push("Aman");
//		s1.push("Khusboo");
//		s1.push("Suraj");
//		s1.push("Manisha");
//		s1.push("Muskan");
//		s1.push("Raman");
//		int res = s1.size();
//		for(int i = 1; i <= res; i++) {
//			System.out.println(s1.pop());
//		}
//		Iterator<String> iterator = s1.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//		System.out.println(s1);
	}
}
