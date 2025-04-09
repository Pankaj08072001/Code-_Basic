package Decision_Making_statements;
import java.util.*;
public class Switch_Statement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Name : ");
	String id = sc.next();

	switch (id) {
	case "Pankaj": {
		System.out.println("18420");
	}
		break;

	case "Kritika": {
		System.out.println(17459);
	}
		break;

	case "Sumedha": {
		System.out.println(18442);
	}
		break;
	default:
		System.out.println("Invalid Java Student");
	}


}
}
