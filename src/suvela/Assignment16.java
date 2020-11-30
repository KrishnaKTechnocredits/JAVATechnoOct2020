/*Assignment 16 : 12th nov'2020 


Find the frequency of each character from user given word.*/
package suvela;

import java.util.Scanner;

public class Assignment16 {
	void findfrequency(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			int counter = 0;
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == ch)
					counter++;
			}
			System.out.println("character " + ch + " is present " + counter + " times");
		}

	}
	void array(String[] array) {
		for (int index = 0; index < array.length; index++) {
			findfrequency(array[index]);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word:");
		String s = scanner.next();
		Assignment16 assign = new Assignment16();
		assign.findfrequency(s);
		String[] array = new String[5];
		for (int index = 0; index < array.length; index++) {
			System.out.println("Enter string:");
			array[index] = scanner.next();
		}
		assign.array(array);
	}
}
