package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		q.add(5);
		q.add(10);
		q.add(15);
		q.add(20);
		q.add(22);
		q.add(23);
		
		System.out.println(q);
		System.out.println(q.contains(5));
	}
}
