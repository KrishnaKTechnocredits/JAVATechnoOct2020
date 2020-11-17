/*Program 1  :  [ Compulsory ]
Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              Total occurrence of e -> 5*/

package shrutiS.assignment_15;

import java.util.Scanner;

public class CharacterFrequencyStringArray {

	void characterFrequency(String[] words, char ch) {
		int totalFrequency = 0;
		for (int i = 0; i < words.length; i++) {
			int frequency = 0;
			String word = words[i];
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(j) == ch)
					frequency++;
			}
			totalFrequency += frequency;
			System.out.println("Occurance of " + ch + " in " + word + " is :" + frequency);
		}
		System.out.println("Total occurance of " + ch + " is :" + totalFrequency);
	}

	public static void main(String[] args) {
		CharacterFrequencyStringArray charfrequency = new CharacterFrequencyStringArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of words");
		int length = sc.nextInt();
		String[] words = new String[length];
		System.out.println("Enter the words");
		for (int index = 0; index < length; index++) {
			words[index] = sc.next();
		}
		System.out.println("Enter the character to know the frequency");
		char ch = sc.next().charAt(0);
		charfrequency.characterFrequency(words, ch);
	}
}
