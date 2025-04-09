package String_and_methods;

public class MethStr {
	public static void main(String[] args) {
		String s1 = "Hello Pankaj chaudhary How are you!!";
		String ar1[] = s1.split(" ");
		
		for(int i = 0; i <= ar1.length-1; i++){
			System.out.println("Index :- "+i+" Value :- "+ar1[i]);
			System.out.println(s1.charAt(i));
	     }
	}	
}
