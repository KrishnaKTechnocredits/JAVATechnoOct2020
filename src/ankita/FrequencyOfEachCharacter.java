/*
 Find the frequency of each character from user given word.
 */
package ankita;

import java.util.Scanner;

public class FrequencyOfEachCharacter {
	void findEachCharacterFrequency(String str) {
		for (int i = 0; i < str.length(); i++) {
			int cnt = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == str.charAt(i))
					cnt++;
			}
			System.out.println(str.charAt(i) + " present " + cnt + " times ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to find character frequency :");
		String strng = sc.next();
		FrequencyOfEachCharacter frequencyOfEachCharacter = new FrequencyOfEachCharacter();
		frequencyOfEachCharacter.findEachCharacterFrequency(strng);
	}
}