package Loop_statement;
import java.util.Scanner;
public class Pattern {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any nubmer : ");
	int n = sc.nextInt();
	
	System.out.println("----------------------------------");	
	for(int i =1; i < n ; i++) {
		for (int j=1; j<=i ; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	System.out.println("----------------------------------");
	for(int i =n; i >= 1 ; i--) {
	for (int j=1; j<=i ; j++) {
		System.out.print("* ");
	}
	System.out.println();
}
	
	System.out.println("----------------------------------");
	for(int i =n; i >= 1 ; i--) {
		for (int j=1; j<i; j++) {
			System.out.print(" ");
		}
		for(int s = n; s>i-1; s--) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("----------------------------------");
	for(int i =n; i >= 1 ; i--) {
		for (int j=1; j<i; j++) {
			System.out.print(" ");
		}
		for(int s = n; s>i-1; s--) {
			System.out.print(" *");
		}
		System.out.println();
	}
	System.out.println("----------------------------------");
	for(int i =n; i >= 1 ; i--) {
		for(int s = 1; s<=i; s++) {                      
			System.out.print(" *");
		}

		for(int j = n; j>i-1; j--) {
			System.out.print(" ");
		}
		System.out.println();
	
       }
   }
}
