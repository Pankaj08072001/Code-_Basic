package Decision_Making_statements;
import java.util.*;
public class VowelConsonat {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your name :");
	String Name  =sc.next();
    char ch = Name.charAt(0);
    if ( ch == 'A' || ch =='E' ||ch == 'I' || ch =='O' || 
    	 ch == 'O' || ch =='U' || ch == 'a' || ch =='e' ||
         ch =='i' || ch =='o' ||ch =='u' ) {
    System.out.println("vowel");
    }else {
    	System.out.println("consonat");
    }
    
}
}
