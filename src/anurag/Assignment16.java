//Assignment 16 : 12th nov'2020 
//Find the frequency of each character from user given word.

package anurag;

import java.util.Scanner;

public class Assignment16 {

	void findFreq(String word) {

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int count = 0;
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(j) == ch)
					count++;
			}
			if (word.charAt(i) != '-')
				System.out.println("Occurence of " + word.charAt(i) + " is :" + count);

			word = word.replace(word.charAt(i), '-');

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word:");
		String input = sc.next();

		Assignment16 assignment16 = new Assignment16();
		assignment16.findFreq(input);
		sc.close();

	}
}