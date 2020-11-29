package shrutiC;

import java.util.Scanner;

/*
 * program 1: sum of all digits from a given string  
	input: te1ch9kj8 
	output:= 18
*/

public class Program1 {

	// Sum of all digits from a given string - te1ch9kj8
	void findSumOfDigits(String string) {

		int sum = 0;
		for (int index = 0; index < string.length(); index++) {

			char ch = string.charAt(index);
			if (Character.isDigit(ch))
				sum += Integer.parseInt(String.valueOf(ch));
		}
		System.out.println("Sum of digits in "+string+" is : "+sum);
	}

	public static void main(String[] args) {
		Program1 object = new Program1();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word containing digits in it : ");
		String string = scanner.next();
		object.findSumOfDigits(string);
	}

}
