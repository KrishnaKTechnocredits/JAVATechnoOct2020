package priyanka.ArrayPrograms;

//Assignment 17: Find frequency of each character in a given string and it should be printed single time.

import java.util.Scanner;

public class FrequencyOfEachChar {

	void findOccurence(String word) {
		for (int i = 0; i < word.length(); i++) {
			int count = 0;
			for (int j = 0; j < word.length(); j++) {
				char ch = word.charAt(j);
				if (ch == word.charAt(i))
					count++;
			}
			System.out.println(word.charAt(i) + " -->" + count);
		}
	}
	public static void main(String[] args) {
		FrequencyOfEachChar frequencyOfEachChar = new FrequencyOfEachChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scanner.next();
		frequencyOfEachChar.findOccurence(word);
	}
}
