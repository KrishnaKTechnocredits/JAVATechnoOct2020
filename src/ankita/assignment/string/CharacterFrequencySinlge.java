/*
 Same as Assignment 16 but each frequency should be printed single time.
input : aakanksha
output : a -> 4
              k -> 2
              n -> 1
              s -> 1
              h -> 1
 */
package ankita.assignment.string;

import java.util.Scanner;

public class CharacterFrequencySinlge {
	void findCharFreqSingleTime(String strng) {
		for (int i = 0; i < strng.length(); i++) {
			int index = strng.indexOf(strng.charAt(i));
			if (i == index) {
				int cnt = 0;
				for (int j = 0; j < strng.length(); j++) {
					if (strng.charAt(i) == strng.charAt(j))
						cnt++;
				}
				System.out.println(strng.charAt(i) + "->" + cnt);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to find charachetr frequency single time:");
		String str = sc.next();
		CharacterFrequencySinlge characterFrequencySinlge = new CharacterFrequencySinlge();
		characterFrequencySinlge.findCharFreqSingleTime(str);
	}
}