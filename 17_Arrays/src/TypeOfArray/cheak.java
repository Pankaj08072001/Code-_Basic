package TypeOfArray;

public class cheak {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 10, 6, 7, 12, 250, 14, 22, 100 };
		int max = 0;
		int sMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
			 	sMax = max;
				max = arr[i];
				continue;
			}
			System.out.println("Max value is  :"+ max);
			System.out.println("SMax value is  :"+ sMax);
			if (sMax< arr[i] )
			{
				sMax = arr[i];
			}
		}
		System.out.println("Max value is  :"+ max);
		System.out.println("Smax value is  :"+ sMax);
	}
}
