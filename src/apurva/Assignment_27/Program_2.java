package apurva.Assignment_27;

import java.util.Arrays;

/*print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9*/
public class Program_2 {
	void printWords(String[] string) {
		System.out.println("Given String: " + Arrays.toString(string));
		for (int index = 0; index < string.length; index++) {
			if (sumOfDigit(string[index]) > 10)
				System.out.println("Words where digit sum is > 10: " + string[index]);
		}
	}
	int sumOfDigit(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				sum = sum + Character.getNumericValue(input.charAt(index));
		}
		return sum;
	}

	public static void main(String[] args) {
		String[] str = { "Ma1s3gj3Pw", "r4f3sjk", "te3ch2no9", "sfjk4p4plpk" };
		new Program_2().printWords(str);
	}
}