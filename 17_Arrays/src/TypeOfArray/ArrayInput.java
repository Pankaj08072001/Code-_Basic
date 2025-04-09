package TypeOfArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
		public static int[] ArraysInput() {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of Array :");
			int size = sc.nextInt();
			int s[] = new int[size];
			for (int i = 0; i < size; i++) {
				s[i] = sc.nextInt();
			}
			Arrays.sort(s);
			return s;
			
	}
}
