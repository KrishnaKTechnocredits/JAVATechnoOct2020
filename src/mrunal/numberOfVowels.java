package mrunal;
/*
Program 5 : [ Compulsory ]
Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i
 */

import java.util.Scanner;

public class numberOfVowels {
		void numberOfVowels(String word) {
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') 
					System.out.println(ch);
			}
		}
		public static void main(String[] args) {
			numberOfVowels countvowels = new numberOfVowels();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter your String ");
			String word = scanner.next();
			System.out.println("Vowels in this string are: ");
			countvowels.numberOfVowels(word);
			scanner.close();
		}
	}
