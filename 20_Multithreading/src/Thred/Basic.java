package Thred;

public class Basic {
	public static void main(String arg[]) {
		System.out.println("------Main in class Basic-------");
		System.out.println("Current Thread :- " + Thread.currentThread().getName());
		System.out.println("Current Thread Group :- " + Thread.currentThread().getThreadGroup().getName());

		System.out.println("**********************************");
		System.out.println();
		Thread th1 = new Thread();
		System.out.println(th1);
		String name = th1.getName();
		System.out.println(name);
		int p = th1.getPriority();
		System.out.println(p);
		th1.setName("Jtc-th1");
		System.out.println(th1.getName());
		th1.setPriority(9);
		System.out.println(th1.getPriority());
		Thread th2 = new Thread();
		System.out.println(th2);
		Thread th3 = new Thread("Jtc");
		System.out.println(th3);
	}
}
