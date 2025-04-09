package DifferKeyword;

public class MultiTCatchBlockWithtry {
	public static void main(String arg[]){
		try{
			int a = Integer.parseInt(arg[0]); // Line-1
			int b = Integer.parseInt(arg[1]); // Line-2
			int c = a / b; // Line-3
			System.out.println("c :- "+c);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception occured...!");
			System.out.println("Please enter the non-zero value as b");
		}
		catch(NumberFormatException e){
			System.out.println("Number Format Exception occured...!");
			System.out.println("Please Enter the input in number format.");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsExceptionoccured...!");
			System.out.println("Please Enter the 2 input from cmd.");
		}
		catch(Exception e){
			System.out.println("This cathc block executes when we get an exception other then above mentioned exception...!");
		}

	}

}
