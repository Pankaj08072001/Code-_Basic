package Clsandobj;

import java.util.Scanner;

public class Logic {
	void setData() {
		String s = "";
		for (int i = 1; i <= 4; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your name: ");
			String str = sc.next();
			s += " " + str;

		}
		System.out.println("Strored Name is : " + s);
	}
}
