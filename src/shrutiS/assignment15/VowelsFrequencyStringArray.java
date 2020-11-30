/*Program 5 : [ Compulsory ]
Java Program to Count the Number of Vowels in user defined string.

Input : technocredits
output : vowels are e , o, i */

package shrutiS.assignment15;

import java.util.Scanner;

public class VowelsFrequencyStringArray {

	void vowelPresence(String word) {
		System.out.print("Vowels are ");
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			switch (ch) {
			case 'a':
				if (word.indexOf(ch) == index)
					System.out.print(ch + ", ");
				break;
			case 'e':
				if (word.indexOf(ch) == index)
					System.out.print(ch + ", ");
				break;
			case 'i':
				if (word.indexOf(ch) == index)
					System.out.print(ch + ", ");
				break;
			case 'o':
				if (word.indexOf(ch) == index)
					System.out.print(ch + ", ");
				break;
			case 'u':
				if (word.indexOf(ch) == index)
					System.out.print(ch + ", ");
				break;
			}
		}
	}

	public static void main(String[] args) {
		VowelsFrequencyStringArray vowel = new VowelsFrequencyStringArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word of your choice ");
		String word = sc.next();
		vowel.vowelPresence(word.toLowerCase());
	}
}
