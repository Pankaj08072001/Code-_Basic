package DifferKeyword;
/* throw keyword is used to throw the exception from the body of the method. If you are throwing 
 * any unchecked exception then there is no hard and fast rule that you will have to report 
 * about that exception using try and catch or by propagating but when it throw a Checked 
 * Exception then we must have to handle it using try-catch block or we can use throws
 * keyword to transfer the responsibility to handle that exception to the method caller.
 * */

// throw is basically used for throw our Born Exception object . define

public class Throwuse {
	public static void main(String[] args) {
		try{
			new A().m1(-1);
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException occured...!");
			System.out.println("you have passed 0 as argument...!");
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException occured...!");
			System.out.println("you have to passed a -ve argument");
		}
	}
		
}
class A{
	void m1(int a){
		if(a > 0){
			System.out.println("The value of a is +ve so all set...!");
		}else if(a == 0){
			throw new ArithmeticException();
		}else{
			throw new NumberFormatException();
		}
	}
}
