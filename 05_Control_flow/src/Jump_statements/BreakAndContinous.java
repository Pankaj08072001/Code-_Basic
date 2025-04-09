package Jump_statements;
import java.util.Scanner;
public class BreakAndContinous {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
	System.out.println("Break Statement skip the all itration: when condition is match ");
	 for (int i = 1; i <=n; i++) {
		 if(i==5)
			break;    // return; terminate the whole program if your used return statement here .
		 System.out.println(i);
	 }
	 System.out.println("Continue Statement skip the current itration: ");
	 for (int i = 1; i <=n; i++) {
		 if(i==5)
			 continue;
		 System.out.println(i);
	 }
	 
	 System.out.println("Return Statement go back the top and no Excution after that : ");
	 for (int i = 1; i <=n; i++) {
		 if(i==5)
			 return;
		 System.out.println(i);
	 }
}
}
