//Program : 3 : swap 2 String with using 3rd variable
package priya;

import java.util.Scanner;

public class SwapTwoStringUsingThirdVariable {
	void swap(String str1, String str2) {
		String temp = "";
		System.out.println("Before Swaping Value at num1 : " + str1);
		System.out.println("Before Swaping Value at num2 : " + str2);
		temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("After Swaping Value at num1 : " + str1);
		System.out.println("After Swaping Value at num2 : " + str2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter First String: ");
		String str1 = scanner.next();
		System.out.println("Please Enter First String: ");
		String str2 = scanner.next();
		SwapTwoStringUsingThirdVariable swapTwoStringUsingThrirdVariable = new SwapTwoStringUsingThirdVariable();
		swapTwoStringUsingThrirdVariable.swap(str1, str2);
		scanner.close();
	}
}
