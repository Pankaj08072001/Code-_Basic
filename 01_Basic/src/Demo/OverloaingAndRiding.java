package Demo; 
public class OverloaingAndRiding extends First{
/* When argument is different and name of method is same this process is called method 
     overloading  .
 * when argument is same and name of method is also same this process is called method 
     overriding .
 * JVM always called main(String [] args ) this is original main method.
 */

	public void meth() {
		System.out.println("overrade method first");
	} 
    public static void main(int num ) {
	System.out.println("overload method");
	}
    public static void main(float num ) {
	System.out.println("overload 1 method");
	}    
    public static void main(String[] args) {
    	OverloaingAndRiding  o = new OverloaingAndRiding ();
	    o.meth();
	    System.out.println("Main method");
	    main(65);
	    main(5.2f);
	}
	

}


