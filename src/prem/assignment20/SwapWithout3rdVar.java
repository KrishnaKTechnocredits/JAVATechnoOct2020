package prem.assignment20;

import java.util.Scanner;

public class SwapWithout3rdVar {
	
	void swapNumber(int num1, int num2) {
		System.out.println("The values of Number1 and Number2 before swapping are " + num1+" " + num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("The values of Number1 and Number2 after swapping are " + num1+" " + num2);	
	}

	public static void main(String[] a) {
		SwapWithout3rdVar swapNumWithout3rdVar = new SwapWithout3rdVar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first no");
		int num1 = scanner.nextInt();
		System.out.println("Enter second no");
		int num2 = scanner.nextInt();
		swapNumWithout3rdVar.swapNumber(num1, num2);
	}
}