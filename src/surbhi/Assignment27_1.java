package surbhi;
import java.util.Arrays;

/*
print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9
*/

public class Assignment27_1 {

	void printWords(String[] input) {
		System.out.println("Given String Array: " + Arrays.toString(input));
		System.out.println("Words which has sum of digit > 10 : ");
		for (int index = 0; index < input.length; index++) {
			if (digitSum(input[index]) > 10)
				System.out.println(input[index]);
		}
	}

	int digitSum(String string) {
		int sum = 0;
		for (int index = 0; index < string.length(); index++) {
			if (Character.isDigit(string.charAt(index)))
				sum += Character.getNumericValue(string.charAt(index));
		}
		return sum;
	}

	public static void main(String[] args) {
		String[] input = { "Ma1s3gj3Pw", "r4f3sjk", "te3ch2no9", "sfjk4p4plpk" };
		new Assignment27_1().printWords(input);
	}
}
