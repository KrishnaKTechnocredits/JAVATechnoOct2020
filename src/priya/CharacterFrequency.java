//*Assignment 14 : Find the frequency of character from a given String array.
//Note: Take String and character from the user.

package priya;

import java.util.Scanner;

public class CharacterFrequency {

	void countFrequency(String word, char ch) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == ch);
			count++;
		}
		System.out.println("In word " + word + "'" + ch + "letter is occuring " + count + "times");
	}

	public static void main(String[] args) {
		CharacterFrequency characterFrequency = new CharacterFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scanner.next();
		System.out.println("Enter the character to know the frequency");
		String tempWord = scanner.next();
		int counter = 1;
		while (tempWord.length() != 1 && counter <= 3) {
			System.out.println("You have entered wrong value. Please enter a character from the word provided. "
					+ (3 - counter) + " attempts remaining");
			tempWord = scanner.next();
			counter++;
			if (tempWord.length() != 1)
				System.out.println("Try again later");
			else {
				char ch = tempWord.charAt(0);
				characterFrequency.countFrequency(word, ch);
				scanner.close();
			}
		}
	}
}
