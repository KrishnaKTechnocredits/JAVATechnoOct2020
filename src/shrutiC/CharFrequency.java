package shrutiC;

import java.util.Scanner;

public class CharFrequency {

	void findFreqOfEachChar(String word) {
		System.out.println("Frequency of each character in '" + word + "' is as below : ");
		for (int index = 0; index < word.length(); index++) {
			char character = word.charAt(index);
			int charCounter = 0;
			for (int i = 0; i < word.length(); i++) {
				if (character == word.charAt(i))
					charCounter++;
			}
			System.out.println("Character " + character + " : " + charCounter);
		}
	}

	public static void main(String[] args) {
		CharFrequency classCharFrequency = new CharFrequency();
		System.out.println("Enter the word : ");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		classCharFrequency.findFreqOfEachChar(word);
	}

}
