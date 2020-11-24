package tejashree;

import java.util.Scanner;

public class Assignment17_IndexOfMethod {

	void findFrequency(String word) {
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int count = 0;
			if (word.indexOf(ch) == i) {
				for (int index = 0; index < word.length(); index++) {
					if (word.charAt(index) == ch)
						count++;
				}
				System.out.println(ch + " is present " + count + " times");
			}
		}
	}

	public static void main(String[] args) {
		Assignment17_IndexOfMethod freqOFEachCharacterwithIndexOf = new Assignment17_IndexOfMethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String userInput = sc.next();
		freqOFEachCharacterwithIndexOf.findFrequency(userInput);

	}

}
