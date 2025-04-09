package String_and_methods;

public class Demo {
	public static void main(String[] args) {
		String [] s = {"pankaj" , "Aman" , "Rajan" , "Jatin" ,};
		for (int i =0; i < s.length; i++)
			System.out.println(s[i]);
		for(String i : s) {
			System.out.println(i);
		}
	}
}
