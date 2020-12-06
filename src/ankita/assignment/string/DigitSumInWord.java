/*Program 2: print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9
*/
package ankita.assignment.string;

import java.util.Arrays;

public class DigitSumInWord {

	void getWordsWithSumGreaterThanTen(String[] str) {
		System.out.println("Input : " + Arrays.toString(str));
		System.out.print("Output : ");
		for (int i = 0; i < str.length; i++) {
			String str1 = str[i];
			int sum = 0;
			for (int j = 0; j < str1.length(); j++) {
				if (Character.isDigit(str1.charAt(j)))
					sum = sum + Character.getNumericValue((str1.charAt(j)));
			}
			if (sum > 10)
				System.out.print(str1 + ", ");
		}
	}

	public static void main(String[] args) {
		String[] input = { "Ma1s3gj3Pw", "r4f3sjk", "te3ch2no9", "sfjk4p4plpk" };
		new DigitSumInWord().getWordsWithSumGreaterThanTen(input);
	}
}
