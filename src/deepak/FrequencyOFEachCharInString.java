package deepak.Asgmt_17;

import java.util.Scanner;

public class FrequencyOFEachCharInString {

	public static void occuranceOfEachChar(String word) {
		for (int i = 0; i < word.length(); i++) {
			int count = 0;
			char ch = word.charAt(i);
			int index = word.indexOf(word.charAt(i));
			if(i==index) {
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j))
					count++;
			}
			System.out.println(ch + " -> " + count);
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Please enter a word");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		FrequencyOFEachCharInString.occuranceOfEachChar(input);
		scanner.close();
	}
} 