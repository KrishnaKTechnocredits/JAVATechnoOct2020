package ankit.StringMethods;

import java.util.Scanner;

public class DigitSumFromString {

	void isDigit(String mixedString) {
		boolean digitFlag = false;
		int sum = 0;
		for (int index = 0; index < mixedString.length(); index++) {
			char chracter = mixedString.charAt(index);
			digitFlag = Character.isDigit(chracter);
			if (digitFlag)
				sum = sum + Character.getNumericValue(chracter);
		}
		System.out.println("Sum of digits in given string " + mixedString + " is: " + sum);
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string mixed with numbers: ");
		String mixedString = scanner.next();
		DigitSumFromString digitSumFromString = new DigitSumFromString();
		digitSumFromString.isDigit(mixedString);
		scanner.close();
	}
}
