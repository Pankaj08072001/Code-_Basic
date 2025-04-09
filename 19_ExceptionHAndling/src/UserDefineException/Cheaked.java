package UserDefineException;

class Raman extends Exception {
	Raman(String s){
		super(s);
		System.out.println("panku");
	}
}

public class Cheaked {
    public static void main(String[] args) {
    	try {
		throw new Raman("hello");
	    }
    	catch(Raman e) {
    		throw new ArithmeticException("It is my create exception class");
    	}
    }
}
