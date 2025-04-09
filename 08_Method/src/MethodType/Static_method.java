package MethodType;

  class Static_method {
  public static int square(int num) {
   return num * num; 
    }

    public static void main(String[] args) {
    
    System.out.println("Squared value of 10 is: " + square(10));
	  }
	}


/* Identify the Static method with the help of Static keyword .
 * 
 * Static method call with the help of Class name.
 * Static method present in same class then call to only method name. 
 *
 * 1-> square();                when the main method & user method present in same class.
 * 2-> Static_method.square();  method present any other package/folder
 * 3-> By object like...
 * i->   new Static_method().square();
 * ii->  Static_method s1 = new Static_method();
 *       s1.square();
 */