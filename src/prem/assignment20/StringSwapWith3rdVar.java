package prem.assignment20;

import java.util.Scanner;

public class StringSwapWith3rdVar {


	void swapString(String a, String b) {
		String temp;
		System.out.println("The values of string1 and string 2 before swapping are: " + a + " " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("The values of string1 and string2 after swapping are: " + a + " " + b);
	}

	public static void main(String[] arg) {
		StringSwapWith3rdVar swapStringWith3rdVar = new StringSwapWith3rdVar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string");
		String a = scanner.next();
		System.out.println("Enter second string");
		String b = scanner.next();
		swapStringWith3rdVar.swapString(a, b);
	}
}