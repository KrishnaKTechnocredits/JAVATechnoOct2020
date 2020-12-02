package nagendra;

import java.util.Scanner;

public class StringChar {

	void findFrequencyOfChar(String input, char word) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == word) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("The Frequency of character " + word + " is " + count + " times");
		} else {
			System.out.println("The character " + word + " is not available in String ");
		}
	}

	public static void main(String[] args) {
		StringChar classObject = new StringChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String   ");
		String unserInput = scanner.next();
		System.out.println("Enter the character who's frequecy is required:");
		String charToSearch = scanner.next();
		int counter = 1;
		while (charToSearch.length() != 1 && counter < 3) {
			System.out.println("Only " + (3 - counter) + " Attemps remaining");
			System.out.println(
					"Wrong input please try with single character otherwise first character from word would be picked!!");

			counter++;
			charToSearch = scanner.next();
		}
		char character = charToSearch.charAt(0);
		classObject.findFrequencyOfChar(unserInput, character);
		scanner.close();
	}

}
