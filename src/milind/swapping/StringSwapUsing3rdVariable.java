package milind.swapping;

import java.util.Scanner;

public class StringSwapUsing3rdVariable {
	
	void stringSwapping(String firstString, String secondString) {
		String temp = "";
		temp = firstString;
		firstString = secondString;
		secondString = temp;
		System.out.println("Fisr string : " + firstString + " Second string : " +secondString);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string : ");
		String firstString = scanner.nextLine();
		System.out.println("Enter second string : ");
		String secondString = scanner.nextLine();
		System.out.println("Fisr string : " + firstString + " Second string : " +secondString);
		StringSwapUsing3rdVariable stringSwapUsing3rdVariable = new StringSwapUsing3rdVariable();
		stringSwapUsing3rdVariable.stringSwapping(firstString, secondString);
		scanner.close();
	}

}
