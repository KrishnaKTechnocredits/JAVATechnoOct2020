package priyanka.Assignment31;

import java.util.Scanner;

/*Program 2:
Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"*/

public class SumOfNumbersAndConvertString {
	int sum = 0;
	String temp = "";
	char ch1;

	void upperToLowerUsingASCII(String name) {
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int ascii = ch;
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
			if (ascii >= 65 && ascii <= 90) {
				ch1 = (char) (ch + 32);
				temp += ch1;
			} else if (ascii >= 97 && ascii <= 122) {
				ch1 = (char) (ch - 32);
				temp += ch1;
			}
		}

		System.out.println("The Converted string is : " + sum + temp);
	}

	public static void main(String[] args) {
		SumOfNumbersAndConvertString sumOfNumbersAndConvertString = new SumOfNumbersAndConvertString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scanner.next();
		System.out.println("String is:" + str);
		sumOfNumbersAndConvertString.upperToLowerUsingASCII(str);
	}

}
