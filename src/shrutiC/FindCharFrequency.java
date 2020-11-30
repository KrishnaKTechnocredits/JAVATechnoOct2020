package shrutiC;

import java.util.Scanner;

public class FindCharFrequency {

	int getFrequencyOfChar(String name, char character) {
		int charCount = 0;

		for (int index = 0; index < name.length(); index++) {
			if (character == name.charAt(index))
				charCount++;
		}

		return charCount;
	}

	public static void main(String[] args) {

		FindCharFrequency frequency = new FindCharFrequency();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name -");
		String name = scanner.next();
		System.out.print("Enter the character - ");
		char character = scanner.next().charAt(0);

		System.out.println("Character " + character + " appears " + frequency.getFrequencyOfChar(name, character)
				+ " times in " + name);

	}

}
