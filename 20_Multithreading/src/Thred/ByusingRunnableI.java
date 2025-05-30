package Thred;

class Process1 implements Runnable {
	public void run() {
		for (int i = 0; i < 20; i++)
			System.out.println("Process 1 : " + i);
	}
}

class Process2 implements Runnable {
	public void run() {
		for (int i = 0; i < 20; i++)
			System.out.println("Process 2 : " + i);
	}
}

public class ByusingRunnableI {
	public static void main(String[] args) {
		Process1 p1 = new Process1();
		Process2 p2 = new Process2();
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		t1.start();
		t2.start();
	}
}
