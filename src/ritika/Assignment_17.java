/* 
Assignment 17 : 13th Nov'2020

Same as Assignment 16 but each frequency should be printed single time.
input : aakanksha
output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1
*/

package ritika;

import java.util.Scanner;

public class Assignment_17 {

	void findFreq(String word) {
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int count = 0;
			if (word.indexOf(ch) == i) {
				for (int j = 0; j < word.length(); j++) {
					if (word.charAt(j) == ch)
						count++;
				}
				System.out.println(ch + " is present " + count + " times");
			}
		}
	}

	public static void main(String[] args) {
		String input = "aakanksha";
		Assignment_17 assignment17 = new Assignment_17();
		assignment17.findFreq(input);

	}
}
