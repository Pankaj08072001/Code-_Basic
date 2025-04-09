package String_and_methods;

public class objStr {
public static void main(String[] args) {
//	String s1 = "Hello";
//	String s2 = "JTC";
//	String s3 = s1 + s2;
//	String s4 = "HelloJTC";
//	
//	System.out.println("s1 == s3 :- "+(s1 == s3)); // false
//	System.out.println("s1 == s2 :- "+(s1 == s2)); // false
//	System.out.println("s3 == s4 :- "+(s3 == s4)); // false
//	
//	System.out.println("s1 :- "+s1); // Hello
//	System.out.println("s2 :- "+s2); // JTC
//	System.out.println("s3 :- "+s3); // HelloJTC
//	System.out.println("s4 :- "+s4); // HelloJTC
	
	String s1 = "ABC";
	String s2 = "ABC";
	
	System.out.println("s1.compareTo(s2) :- "+(s1.compareTo(s2))); // 0

	String s3 = "ACC";
	
	System.out.println("s1.compareTo(s3) :- "+(s1.compareTo(s3))); // -1

	String s4 = "ABCJTC";
	
	System.out.println("s1.compareTo(s4) :- "+(s1.compareTo(s4))); // -3

	System.out.println("s3.compareTo(s4) :- "+(s3.compareTo(s4))); // 1
}
}
