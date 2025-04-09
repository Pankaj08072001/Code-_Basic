package Decision_Making_statements;
import java.util.*;
public class Nested_if_statement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Age :");
    int age = sc.nextInt();
    if(age < 60) {    
	    if(age>18) {    
        System.out.println("You can drive :");    
	    }
	    else {    
    	System.out.println("Your can't drive: ");    
	    }
	   
	}
	else {    
	System.out.println("You are Seniour citizen:");    
	}    
}
}
