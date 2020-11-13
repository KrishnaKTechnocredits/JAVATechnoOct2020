package shrutiS.codingExam;

import java.util.Scanner;

public class CharacterFrequency {

	void frequencyOfCharacterState(String word) {
		int letterCount = 0;
		int UpperCount = 0;
		int lowerCount = 0;
		int specialCount = 0;
		int digitCount = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isLetter(ch))
				letterCount++;
			if (Character.isUpperCase(ch))
				UpperCount++;
			if (Character.isLowerCase(ch))
				lowerCount++;
			if (Character.isDigit(ch))
				digitCount++;
			if (!Character.isLetter(ch) && !Character.isDigit(ch))
				specialCount++;
		}
		System.out.println("\nTotal Letter in " + word + " is :" + letterCount);
		System.out.println("\nTotal UpperCase in " + word + " is :" + UpperCount);
		System.out.println("\nTotal LowerCase in " + word + " is :" + lowerCount);
		System.out.println("\nTotal Digit in " + word + " is :" + digitCount);
		System.out.println("\nTotal SpecialCharacter in " + word + " is :" + specialCount);
	}

	public static void main(String[] args) {
		CharacterFrequency characterFrequency = new CharacterFrequency();
		// String word = "teCh@N12JCR#iT8s_B";
		// System.out.println("Given Word is "+word);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word of your choice");
		String word = sc.next();
		characterFrequency.frequencyOfCharacterState(word);
	}
}
