package UserDefineException;

public class CustomException {
	public static void main(String[] args) {
		try {
            // Throw an object of user defined exception
            throw new MyException("pankaj");
        }
        catch (MyException ex) {
            System.out.println("Chaudhary");
 
            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
	}
}
@SuppressWarnings("serial")
class MyException extends Exception {
//	public  MyException(String s)
//    {
//        // Call constructor of parent Exception
//        super(s);
//    }
	public MyException(String s1) {
		super(s1);
	}
}
 