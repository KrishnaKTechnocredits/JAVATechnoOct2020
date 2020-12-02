package priyanka.Assignment27;

import java.util.Arrays;

/*Program 2: print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9*/

public class WordSum {

	void printWordWhereDigitSum(String[] str) {
		for (int index = 0; index < str.length; index++) {
			String word = str[index];
			int sum = 0;
			for (int innerIndex = 0; innerIndex < word.length(); innerIndex++) {
				char ch = word.charAt(innerIndex);
				if (Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}
			}
			if (sum > 10)
				System.out.println("The word where digit sum is > 10 : " + word);
		}
	}

	public static void main(String[] arg) {
		WordSum wordSum = new WordSum();
		String[] arr = { "Ma1s3gj3Pw", "r4f3sjk", "te3ch2no9", "sfjk4p4plpk", "sfjk8p4plpk" };
		System.out.println(" The given String is : " + Arrays.toString(arr));
		wordSum.printWordWhereDigitSum(arr);
	}
}
