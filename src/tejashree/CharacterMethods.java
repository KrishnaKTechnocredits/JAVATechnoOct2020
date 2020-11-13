package tejashree;

import java.util.Scanner;

public class CharacterMethods {

	void findFrequency(String word) {
		// char ch=word.charAt(0);
		int digitCount = 0, letterCount = 0, upperCount = 0, lowerCount = 0, specCount = 0;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isLetter(ch)) {
				letterCount++;
				if (Character.isUpperCase(ch))
					upperCount++;
				else
					lowerCount++;

			} else if (Character.isDigit(ch))
				digitCount++;
			else
				specCount++;
		}
		System.out.println("Letters count in a given word is:" + letterCount);
		System.out.println("UpperCase count in a given word is:"+ upperCount);
		System.out.println("LowerCase count in a given word is:" + lowerCount);
		System.out.println("Digit count in a given word is:" + digitCount);
		System.out.println("Special count in a given word is:" + specCount);

	}

	public static void main(String[] args) {
		CharacterMethods freqOFEachCharacterwithIndexOf = new CharacterMethods();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String userInput = sc.next();
		freqOFEachCharacterwithIndexOf.findFrequency(userInput);

	}

}
