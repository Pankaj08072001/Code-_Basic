package Thred;

class A {
	synchronized void m1() {
		for (int i = 1; i <= 15; i++) {
			System.out.println(Thread.currentThread().getName() + " is processing :- " + i);
			try {
				this.wait(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread1 extends Thread {
	A a1;

	Thread1(A a1) {
		this.a1 = a1;
	}

	public void run() {
		a1.m1();
	}
}

class Thread2 extends Thread {
	A a1;

	Thread2(A a1) {
		this.a1 = a1;
	}

	public void run() {
		a1.m1();
	}
}

class Synchronization1 {
	public static void main(String arg[]) {
		A a1 = new A();
		Thread1 t1 = new Thread1(a1);
		Thread2 t2 = new Thread2(a1);
		t1.setName("T-1");
		t2.setName("T-2");
		t1.start();
		t2.start();
	}
}