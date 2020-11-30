package tejashree;

import java.util.Scanner;

//Find frequency of each character in a given string
public class Assignment16 {
	void findFrequency(String word) {
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int cnt = 0;
			for (int index = 0; index < word.length(); index++) {
				if (word.charAt(index) == ch) {
					cnt++;
				}
			}
			System.out.println("char" + "'" + ch + "'" + "is repeated " + cnt + " times");
		}
	}

	public static void main(String[] args) {
		Assignment16 freqOfEachCharInString = new Assignment16();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String userInput = sc.next();
		freqOfEachCharInString.findFrequency(userInput);
	}
}
