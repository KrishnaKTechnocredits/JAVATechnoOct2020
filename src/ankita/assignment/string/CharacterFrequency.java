package ankita.assignment.string;

import java.util.Scanner;

public class CharacterFrequency {

	int findCharacterFrequency(String name, char ch) {
		int charCnter = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch)
				charCnter++;
		}
		return charCnter;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CharacterFrequency characterFrequency = new CharacterFrequency();
		int cnt = 1;
		System.out.println("Enter String : ");
		String word = scanner.next();
		System.out.println("Enter character to find :");
		String character = scanner.next();
		while (character.length() != 1 && cnt < 3) {
			System.out.println("Enter only one character");
			character = scanner.next();
			cnt++;
		}
		if (character.length() != 1)
			System.out.println("Please try later.Tried multiple attempts.");
		else {
			char ch = character.charAt(0);
			System.out.println("character frequency is :" + characterFrequency.findCharacterFrequency(word, ch));
		}
	}
}