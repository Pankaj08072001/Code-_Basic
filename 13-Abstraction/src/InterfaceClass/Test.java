package InterfaceClass;

import java.util.Arrays;
import java.util.Scanner;

public interface Test {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number:");
     int a =sc.nextInt();
     int b =sc.nextInt();
     long []  s;  
      int arr [] [] = new int[a] [b];
      for (int i = 0; i < arr.length; i++) {
    	  s = arr[i][i];
      }
         System.out.println("Enter the Specific Size of array: "+ Arrays.toString(s));
     
}
}
