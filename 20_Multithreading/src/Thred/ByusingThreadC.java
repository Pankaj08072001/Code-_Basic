package Thred;

class Process3 extends Thread {
	public void run() {
		for (int i = 0; i < 20; i++)
			System.out.println("Process 1 : " + i);
	}
}

class Process4 extends Thread {
	public void run() {
		for (int i = 0; i < 20; i++)
			System.out.println("Process 2 : " + i);
	}
}

public class ByusingThreadC {
	public static void main(String[] args) throws InterruptedException {
		Process3 p1 = new Process3();
		Process4 p2 = new Process4();
		p1.start();
		p2.start();
		System.out.println(p1.getName());
		System.out.println(p1.getPriority());

	}
}
