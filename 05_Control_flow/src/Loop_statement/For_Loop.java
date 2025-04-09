package Loop_statement;
import java.util.*;
public class For_Loop {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		for(int j= 1; j <=3; j++) {
			System.out.print("Enter Your id:");
			int id = sc.nextInt();
			
			System.out.print("Enter your name  : ");
			String  Name  = sc.next();
			
			System.out.print("Enter Your any course : ");
			String course= sc.next();
			
			s+= "id: " +id + "\n";
			s+= "Name :  "+Name + "\n";
			s+= "Course  :"+course + "\n";
			System.out.println(s);
			
		}
		
	}	
}
