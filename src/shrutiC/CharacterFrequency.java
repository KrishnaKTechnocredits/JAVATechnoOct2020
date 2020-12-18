package shrutiC;

import java.util.Scanner;

public class CharacterFrequency {

	void findFreqOfEachChar(String word) {
		System.out.println("Frequency of each character in '" + word + "' is as below : ");
		for (int index = 0; index < word.length(); index++) {
			char character = word.toLowerCase().charAt(index);
			int charCounter = 0;
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				int val = word.indexOf(character);
				if (character == word.charAt(i) && index == word.indexOf(character))
					charCounter++;
			}
			if (charCounter > 0)
				System.out.println("Character " + character + " : " + charCounter);
		}
	}

	public static void main(String[] args) {
		CharacterFrequency classCharFrequency = new CharacterFrequency();
		System.out.println("Enter the word : ");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		classCharFrequency.findFreqOfEachChar(word);
	}

}
