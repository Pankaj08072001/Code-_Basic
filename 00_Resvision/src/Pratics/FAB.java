package Pratics;

public class FAB {
public static void main(String[] args) {
	int fact = 1;
	int num = 6;
	for (int i = 1; i <num; i++) {
		fact *= i;
	}
	System.out.println("Factorial is :  " +fact);
}
}
