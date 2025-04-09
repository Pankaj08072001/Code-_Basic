package TypeOfArray;

public class StudentSecondHightestMax {
public static void main(String[] args) {
	int a[] = {12,32,98,43,62,68,43,78,77,55,178,54,78,86,89,57,}; 
	int max = a[0];
	int smax= a[0];
	for(int i = 0 ; i < a.length; i++)
	{
		if (a[i] > max ) {
			smax = max;
			max = a[i];
			continue;
		}
		if (smax < a[i] )
		{
			smax = a[i];
		}
	}
	System.out.println("Max value is : " + max);
	System.out.println("Max value is : " + smax);
	}
}

