package ankit.StringMethods;

import java.util.Scanner;

public class SumOfNumberFromString {

	void findSumOfAllNumbersLogic(String input) {
		String[] splitAction = input.split(" ");
		int sum = 0;
		String temporary = "";
		for (int index = 0; index < splitAction.length; index++) {
			String word = splitAction[index];
			for (int innerIndex = 0; innerIndex < word.length(); innerIndex++) {
				if (Character.isDigit(word.charAt(innerIndex)))
					temporary += word.charAt(innerIndex);
				else {
					if (temporary.length() > 0) {
						sum += Integer.parseInt(temporary);
						temporary = "";
					}
				}
			}
		}
		if (temporary.length() > 0)
			sum += Integer.parseInt(temporary);
		System.out.println("Sum of numbers in string is: " + sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the provided string mixed with numbers: ");
		String input = scanner.nextLine();
		SumOfNumberFromString sumOfNumberFromString = new SumOfNumberFromString();
		sumOfNumberFromString.findSumOfAllNumbersLogic(input);
		scanner.close();
	}
}
