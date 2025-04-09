package Decision_Making_statements;
import java.util.*;
public class IF_Else_Lader {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your city name :");
	String city = sc.next();
	
	if(city == "Meerut") {  
	System.out.println("city is meerut");  
	}
	else if (city == "Noida") {  
	System.out.println("city is noida");  
	}
	else if(city == "Agra") {  
	System.out.println("city is agra");  
	}
	else {  
	System.out.println("Your city name is : "+city);  
	}  
}
}
