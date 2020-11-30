/*Assignment 14  10th Oct 2020
Find the frequency of character from a given String array. 
Note Take String and character from the user.
 */

package shrutiS;

import java.util.Scanner;

public class CharacterFrequency {

	void calculateFrequency(String word, char ch) {
		int frequency = 0;
		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == ch)
				frequency++;
		}
		System.out.println("In the word '" + word + "' letter '" + ch + "' is coming " + frequency + " times");
	}

	public static void main(String[] a) {
		CharacterFrequency characterFrequency = new CharacterFrequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word of your choice");
		String word = sc.next();
		System.out.println("Enter the character to know the frequency");
		String tempWord = sc.next();
		int count = 1;
		while (tempWord.length() != 1 && count < 3) {
			System.out.println("You have entered wrong value. Please enter a character from the word provided. "+ (3 - count) + " attempts remaining");
			tempWord = sc.next();
			count++;
		}
		if (tempWord.length() != 1)
			System.out.println("Try again later");
		else {
			char ch = tempWord.toLowerCase().charAt(0);
			characterFrequency.calculateFrequency(word, ch);
		}
	}

}
