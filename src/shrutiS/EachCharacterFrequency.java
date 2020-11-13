/*Assignment 16 : 12th nov'2020 

Find the frequency of each character from user given word.*/

package shrutiS;

import java.util.Scanner;

public class EachCharacterFrequency {

	void eachCharFrequency(String word) {
		char[] tempChar = new char[word.length()];
		int charIndex = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int count = 0;
			boolean condition = false;
			for (int j = 0; j < tempChar.length; j++) {
				if (ch == tempChar[j] ) {
					condition = true;
					break;
				}else if(tempChar[j]== '\u0000')
						break;
				}
			if (!condition) {
				for (int k = 0; k < word.length(); k++) {
					if (word.charAt(k) == ch)
						count++;
				}
				tempChar[charIndex++]=ch;
				System.out.println("Character '" + ch + "' occures " + count + " times");
			}
		}
	}

	public static void main(String[] args) {
		EachCharacterFrequency charFrequency = new EachCharacterFrequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word of your choice ");
		String word = sc.next();
		charFrequency.eachCharFrequency(word.toLowerCase());
	}
}
