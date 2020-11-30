/*print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9*/
package suvela.assignment27;

import java.util.Arrays;

public class Assign27_1 {
	void sumOfDigitsInWord(String[] array) {
		System.out.println("Input :" + Arrays.toString(array));
		System.out.print("Output :");
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			String s = array[i];
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				if (Character.isDigit(ch))
					sum += Character.getNumericValue(ch);
			}if(sum>10)
				System.out.print(s);
		}
	}

	public static void main(String[] args) {

		String[] input = { "Ma1s3gj3Pw", "r4f3sjk", "te3ch2no9", "sfjk4p4plpk" };
		new Assign27_1().sumOfDigitsInWord(input);
	}

}
