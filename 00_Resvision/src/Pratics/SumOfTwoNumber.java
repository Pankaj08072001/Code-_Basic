package Pratics;
import java.util.Scanner;
public class SumOfTwoNumber {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Second Number: ");
	int a = sc.nextInt();
    System.out.println("Enter the Second Number: ");
	int b = sc.nextInt();
	System.out.println("Sum of the Number is : "+ (a+b));
	System.out.println("Sum of the Number is : "+(a-b));
	System.out.println("Sum of the Number is : "+ (a*b));
	System.out.println("Sum of the Number is : "+(a/b));
	System.out.println("Sum of the Number is : "+(a%b));

	}
}