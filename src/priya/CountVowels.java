package priya;

import java.util.Scanner;

public class CountVowels {

	void findVowels(String word) {
		System.out.println("Vowels are --> ");
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				System.out.println(ch);
			}
		}
	}

	public static void main(String[] args) {
		CountVowels countvowels = new CountVowels();
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		countvowels.findVowels(word);
		scanner.close();
	}

}
