package priyanka.ArrayPrograms;

//Assignment 17: Find frequency of each character in a given string and it should be printed single time.

import java.util.Scanner;

public class FrequencyOfEachChar {

	void findOccurence(String word) {
		System.out.println("String is :" + word);
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int index = word.indexOf(word.charAt(i));
			if (i == index) {
				int cnt = 0;
				for (int j = 0; j < word.length(); j++) {
					if (word.charAt(i) == word.charAt(j))
						cnt++;
				}
				System.out.println(ch + " ---->" + cnt + " times");
			}
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
