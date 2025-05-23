package MethodType;

public class Instance_method {

  // method with no parameter
	 public void display1() {
		  System.out.println("Method without parameter");
	}

 // method with single parameter
	 public void display2(int a) {
		   System.out.println("Method with a single parameter: " + a);
	 }

	 public static void main(String[] args) {
		    
	 // create an object of Instance_method Instance method call by obj only.
	 Instance_method obj = new Instance_method();

     // calling method with no parameter
     obj.display1();
		    
     // calling method with the single parameter
     obj.display2(24);
	}
 }
/* Identify the Instance method with not present static keyword .
 * 
 * Instance method call by 
 * 1->  by object 
 * 2->
 * 
 * 
 * 
 */
