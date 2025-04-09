package TypeOfArray;

public class SwapNumber {
	public static void main(String[] args) {
		System.out.println("Swaping of two number :");
		int a = 4;
		int b = 3;
		System.out.println("Before swaping ");
		System.out.println("A is : " + a);
		System.out.println("B is : " + b);
//		int c = a;
//		a = b;
//		b = c;
//		
//		System.out.println("After swaping ");
//		System.out.println("A is " + a);
//		System.out.println("B is " + b);
//		
		System.out.println("Swaping of two number without third variable :");
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("A is : " + a);
		System.out.println("B is : " + b);		
	}
}
