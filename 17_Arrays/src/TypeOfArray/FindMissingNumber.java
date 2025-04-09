package TypeOfArray;

import java.util.Arrays;

public class FindMissingNumber {
	public static void main(String[] args) {
		int arr[] = ArrayInput.ArraysInput();
		System.out.println(Arrays.toString(arr));
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i]+1 <= arr[i+1]) {
				break;
			}	
			else {
				System.out.println(arr[i]);
			}
		
		}
		
	}
}
