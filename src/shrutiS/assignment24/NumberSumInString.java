/*Assignment - 24 : 22nd Nov'2020 
program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140*/

package shrutiS.assignment24;

public class NumberSumInString {

	void findSumOfAllNumber(String input) {
		int sum = 0;
		String number = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				number= number+ch;
			}
			else if (Character.isLetter(ch)) {
				if (number.length() > 0) {
					sum = sum + Integer.parseInt(number);
					number = "";
				}
			}
		}
		if (number.length() > 0) {
			sum = sum + Integer.parseInt(number);
			number = "";
		}
		System.out.println("Sum of all numbers in a give string "+input+" :\n 123+9+8 = "+sum);
	}

	public static void main(String[] args) {
		NumberSumInString digitSum = new NumberSumInString();
		String input = "te123ch9kj8 ";
		digitSum.findSumOfAllNumber(input);
	}
}