package Diff_Op;
import java.util.*;
public class TernaryOperator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your a number : ");
	int a= sc.nextInt();
	
	System.out.print("Enter your b number : ");
	int b= sc.nextInt();
	
	System.out.print("Enter your c number : ");
	int c= sc.nextInt();
	
	// For Single Condition. 
	String min =(a > 0) ? "Postive Number ": "Negative Number ";  
	System.out.println(min);  

	// For Multiple condition. 
	String min1 = (a > b && a>c ) ? "A is greater " +a : (b>c )? "B is greater  "+b : "C is greater "+c; 
	System.out.println(min1);
}
}
