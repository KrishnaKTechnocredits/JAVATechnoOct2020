/*program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140*/

package anurag;

public class Assignment24_2 {
	void sumOfDigits(String str) {
		System.out.println("Input String is - " + str);
		int sum = 0;
		String digit = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (digit.length() > 0) {
				sum += Integer.parseInt(digit);
				System.out.println(digit);
				digit = "";
			}
		}
		if (digit.length() > 0) {
			sum =sum + Integer.parseInt(digit);
		}
		System.out.println("Sum of digits is " + sum);

	}

	public static void main(String args[]) {
		Assignment24_2 assignment24_2 = new Assignment24_2();
		assignment24_2.sumOfDigits("te123ch9kj8");
		System.out.println();
		assignment24_2.sumOfDigits("ab098cd25efg120h");
	}
}