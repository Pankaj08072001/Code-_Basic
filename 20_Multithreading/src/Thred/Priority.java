package Thred;

/* 1. MIN_PRIORITY: Minimum priority of the thread will be 1.
 * 2. MAX_PRIORITY: Maximum priority of the Thread will be 10.
 * 3. NORM_PRIORITY: Normal priority of the Thread will be 5.
*/
public class Priority {
	public static void main(String arg[]) {
		A a1 = new A();
		Thread1 t1 = new Thread1(a1);
		Thread2 t2 = new Thread2(a1);
		t1.start();
		t2.start();
	}

}

class A {
	synchronized void m1() {
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " ----> " + i);
				this.wait(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	synchronized void m2() {
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " ----> " + i);
				this.wait(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread1 extends Thread {
	A a1 = null;

	Thread1(A a1) {
		this.a1 = a1;
	}

	public void run() {
		a1.m1();
		this.stop();
		System.out.println(Thread.currentThread().getName() + " is completed...");
	}
}

class Thread2 extends Thread {
	A a1 = null;

	Thread2(A a1) {
		this.a1 = a1;
	}

	public void run() {
		a1.m2();
		System.out.println(Thread.currentThread().getName() + " is completed...");
	}

}
