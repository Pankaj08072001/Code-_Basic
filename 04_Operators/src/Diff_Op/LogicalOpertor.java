package Diff_Op;

public class LogicalOpertor {
public static void main(String[] args) {
	int a=10;  
	int b=5;  
	int c=20;  
	System.out.println(a<b &&  a++<c);   //false && true = false  
	System.out.println(a);               //10 because second condition is not checked  
	System.out.println(a<b  &  a++<c);   //false && true = false  
	System.out.println(a);               //11 because second condition is checked  
	
	
	System.out.println("*************************");
	System.out.println(a>b||a++<c);      //true || true = true  
	System.out.println(a);               //10 because second condition is not checked  
	System.out.println(a>b|a++<c);       //true | true = true  
	System.out.println(a);               //11 because second condition is checked    

	
	System.out.println("*************************");
	System.out.println( !(true));        // false
	System.out.println( !(false));       // true
}
}
