package brijesh.codingexams;

import java.util.Scanner;

public class Exam2 {

	void printData(String string) {
		int upperCount = 0, loweCount = 0, digitCount = 0, letterCount = 0, specialCount = 0;
		for (int index = 0; index < string.length(); index++) {
			char character = string.charAt(index);
			if (Character.isLetter(character)) {
				letterCount++;
				if (Character.isUpperCase(character))
					upperCount++;
				else
					loweCount++;
			} else if (Character.isDigit(character))
				digitCount++;
			else
				specialCount++;
		}
		System.out.println("Letters: "+letterCount+"\nUpperCase Characters: "+upperCount+"\nLowercase Characters: "+loweCount+"\nDigits: "+digitCount+"\nSpecial Characters: "+specialCount);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string:");
		new Exam2().printData(scanner.nextLine());
		scanner.close();
	}

}
