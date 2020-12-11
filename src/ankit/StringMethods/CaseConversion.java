package ankit.StringMethods;

import java.util.Scanner;

public class CaseConversion {

	void caseConversionLogic(String word) {
		String convertedWord="";
		for (int index = 0; index < word.length(); index++) {
			char character = word.charAt(index);
			if (Character.isUpperCase(character))
				convertedWord = convertedWord + Character.toLowerCase(character);
			else if (Character.isLowerCase(character))
				convertedWord = convertedWord + Character.toUpperCase(character);
			else if (Character.isDigit(character))
				convertedWord = convertedWord + character; 
			else 
				convertedWord = convertedWord + character;
		}
		System.out.println("Converted String is: " +convertedWord);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string mixed with upper case, lower case, digit and special character: ");
		String word = scanner.next();
		CaseConversion caseConversion = new CaseConversion();
		caseConversion.caseConversionLogic(word);
		scanner.close();
	}

}
