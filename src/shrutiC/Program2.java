package shrutiC;

import java.util.Scanner;

/*
 * program 2 : sum of all numbers in a give string 
	input: te123ch9kj8 
	output : 123 + 9 + 8 = 140*/

public class Program2 {

	void findSumOfNumbers(String string) {

		int sum = 0;
		String num = "0";

		for (int index = 0; index < string.length(); index++) {

			char ch = string.charAt(index);
			if (Character.isDigit(ch)) {
				num += ch;
			} else {
				if (num.length() > 0) {
					sum += Integer.parseInt(num);
					num = "";
				}
			}
		}
		if (num.length() > 0)
			sum += Integer.parseInt(num);
		System.out.println("Sum of numbers in " + string + " is : " + sum);
	}

	public static void main(String[] args) {

		Program2 object = new Program2();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word containing digits in it : ");
		String string = scanner.next();
		object.findSumOfNumbers(string);
	}

}