package Decision_Making_statements;
import java.util.*;
public class IF_Else {
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	
	// if Statement is used without else block but else block is always used with if block 
	
	System.out.print("Enter tha ist num1 :");
    int num1 = s1.nextInt();
	
	if(num1 % 2 ==0) {
		System.out.println("Even");   // condition true then this block executed. 
	}
	else {
		System.out.println("Odd");    // condition false then this block executed. 
	}
	
}
}
