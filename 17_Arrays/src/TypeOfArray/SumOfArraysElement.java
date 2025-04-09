package TypeOfArray;

import java.util.Arrays;

public class SumOfArraysElement {
	public static void main(String[] args) {
	    int a[] = ArrayInput.ArraysInput();
		System.out.println(Arrays.toString(a));
		int sum = 0;
		for(int i =0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Sum of arrays is : " + sum );
	}
}
