//Program : 1 : swap 2 numbers with using 3rd variable

package priya;

import java.util.Scanner;

public class SwapTwoNumbersUsingThirdVariable {
	void swap(int num1, int num2) {
		int temp = 0;
		System.out.println("Before Swaping Value at num1 : " + num1);
		System.out.println("Before Swaping Value at num2 : " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swaping Value at num1 : " + num1);
		System.out.println("After Swaping Value at num2 : " + num2);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter First Number: ");
		int firstNo = scanner.nextInt();
		System.out.println("Please Enter Second Number: ");
		int secondNo = scanner.nextInt();
		SwapTwoNumbersUsingThirdVariable swapTwoNosUsingThirdVaraible = new SwapTwoNumbersUsingThirdVariable();
		swapTwoNosUsingThirdVaraible.swap(firstNo, secondNo);
		scanner.close();
	}
}
