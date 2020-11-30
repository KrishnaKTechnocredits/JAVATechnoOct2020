/*Program 1: sum of all numbers from give string.  

String str = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well. */

package anurag;

public class Assignment25 {
	void sumOfAllDigitsInString(String str) {
		
		int sum = 0;
		String digit = "";
		
		System.out.println("Input String - " + str);
		
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (digit.length() > 0) {
				sum =sum + Integer.parseInt(digit);
				System.out.println(digit);
				digit = "";
			}
		}
		if (digit.length() > 0) {
			sum = sum + Integer.parseInt(digit);
		}
		System.out.println("Sum of above numbers is " + sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment25 assignment25 = new Assignment25();
		assignment25.sumOfAllDigitsInString("I have 15 years and 2 months of experience.");

	}

}