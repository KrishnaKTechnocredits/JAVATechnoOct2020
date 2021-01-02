package ruby.collections;

import java.util.Arrays;

/*Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno   */

public class A47ReplaceWord {
	static void findWord(String input) {
		System.out.println("Input String: " + input);
		int count = 0;
		String[] wordArr = input.split(" ");
		for (int index = wordArr.length - 1; index >= 0; index--) {
			if (wordArr[index].equalsIgnoreCase("Hi")) {
				count++;
				if (count == 2) {
					wordArr[index] = "RUBY";
				}
			}
		}
		System.out.println("Output String: " + Arrays.toString(wordArr));
	}

	public static void main(String[] args) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		A47ReplaceWord.findWord(input);
	}
}
