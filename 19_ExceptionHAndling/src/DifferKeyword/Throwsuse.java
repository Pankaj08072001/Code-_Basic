package DifferKeyword;
/* 1:- Throws keyword is used to hand-over our responsibility to the caller 
 * 2:- Another words only convenes to the compiler and testing purpose    
 * */
class A{
	void m1(int a)throws ClassNotFoundException, java.io.FileNotFoundException {
		if(a > 0){
			System.out.println("The value of a is +ve so all set...!");
		}else if(a == 0){
			throw new ClassNotFoundException();
		}else{
			throw new java.io.FileNotFoundException();
		}
	}
}

public class Throwsuse {
	public static void main(String arg[]) throws ClassNotFoundException, java.io.FileNotFoundException{
	    new A().m1(5);
    }
}
