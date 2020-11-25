/*Assignment - 24 : 22nd Nov'2020 

program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18*/

package shrutiS.assignment24;

public class DigitSumInString {

	void findSumOfAllDigit(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				sum = sum + Character.getNumericValue(ch);
		}
		System.out.println("sum of all digits from a given string : " + sum);
	}

	public static void main(String[] args) {
		DigitSumInString digitSum = new DigitSumInString();
		String input = "te1ch9kj8 ";
		digitSum.findSumOfAllDigit(input);
	}
}
