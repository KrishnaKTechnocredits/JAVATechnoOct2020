/*
 * 1.42-1.57  3-3.19 3.20-352
 * Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              Total occurrence of e -> 5
 */

package ankita;

import java.util.Scanner;

public class CharacterFrequencyFromArray {
	void findCharacterFrequencyFromArray(String[] strArray, char ch) {
		for (int i = 0; i <= strArray.length - 1; i++) {
			int cnt = 0;
			for (int y = 0; y <= strArray[i].length() - 1; y++) {
				if (strArray[i].charAt(y) == ch)
					cnt++;
			}
			System.out.println(strArray[i] + "->" + cnt);
		}
	}
	public static void main(String[] args) {
		CharacterFrequencyFromArray characterFrequencyFromArray = new CharacterFrequencyFromArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store::");
		int number = sc.nextInt();
		System.out.println("Enter character to find:");
		String ch = sc.next();
		int cntr=0;
		while (ch.length() != 1 && cntr < 3) {
			System.out.println("Enter only one character");
			ch = sc.next();
			cntr++;
		}
		if (ch.length() != 1)
			System.out.println("Multiple attempts.please try later");
		else {
			System.out.println("Enter String");
			String arr[] = new String[number];
			for (int i = 0; i < number; i++) {
				arr[i] = sc.next();
			}
			characterFrequencyFromArray.findCharacterFrequencyFromArray(arr, ch.charAt(0));
		}
	}
}