package milind.swapping;

import java.util.Scanner;

public class StringSwapWithout3rdVariable {
	
	void stringSwapping(String firstString, String secondString) {
		int firstStringLength = firstString.length();
		firstString = firstString + secondString;
		secondString = firstString.substring(0, firstStringLength);
		firstString = firstString.substring(firstStringLength, firstString.length());
		System.out.println("First string " + firstString + " Second string " + secondString);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First string : ");
		String firstString = scanner.nextLine();
		System.out.println("Second string : ");
		String secondString = scanner.nextLine();
		System.out.println("First string " + firstString + " Second string " + secondString);
		StringSwapWithout3rdVariable stringSwapWithout3rdVariable = new StringSwapWithout3rdVariable();
		stringSwapWithout3rdVariable.stringSwapping(firstString, secondString);
		scanner.close();
	}

}
