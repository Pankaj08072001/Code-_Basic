package TypeOfArray;

public class SwapNumWithXor {
	public static void main(String[] args) {
		int x = 5;
		int y = 6;
		System.out.println("swaping............");
		x = x^y;
		y = x^y;
		x = x^y;
		System.out.println(x);
		System.out.println(y);
	
	}
}
