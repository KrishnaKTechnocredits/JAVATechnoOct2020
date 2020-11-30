/*print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9*/
package poojap;

import java.util.Arrays;

public class WordDigitSum {

	void findSum(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			String digit = "";
			int sum = 0;
			for (int j = 0; j < word.length(); j++) {
				char ch = word.charAt(j);
				if (Character.isDigit(ch)) {
					digit = digit + ch;
					sum = sum + Integer.parseInt(digit);
					digit = "";
				}
			}
			// System.out.println(sum);
			if (sum > 10) {
				System.out.println("Word which has sum of digit greater than Ten is: " + word);
			}
		}
	}

	public static void main(String[] args) {
		WordDigitSum wordDigitSum = new WordDigitSum();
		String[] input = { "Ma1s3gj3Pw", "r4f3sjk", "te3ch2no9", "sfjk4p4plpk" };
		System.out.println("Array is : " + Arrays.toString(input));
		wordDigitSum.findSum(input);
	}
}
