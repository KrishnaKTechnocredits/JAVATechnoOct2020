/*
  Program 2: print all the words where digit sum is > 10. 
  
  String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};

  output : te3ch2no9

 */
package yogita;

import java.util.Arrays;

public class FindMaximumSumString {

	void maximumStringSum(String[] name) {
		System.out.println("Array Of String is:" + Arrays.toString(name));
		for (int i = 0; i < name.length; i++) {
			String str = name[i];
			int sum = 0;
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (Character.isDigit(ch)) {
					sum += Character.getNumericValue(ch);
				}
				if (sum > 10) {
					System.out.println("String whose Digit's Sum is Greater than 10 is: "+str);
				}
			}
		}
	}

	public static void main(String[] args) {
		FindMaximumSumString maximumSum = new FindMaximumSumString();
		String[] input = { "Ma1s3gj3Pw", "r4f3sjk", "te3ch2no9", "sfjk4p4plpk" };
		maximumSum.maximumStringSum(input);

	}
}
