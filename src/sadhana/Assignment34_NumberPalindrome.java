/*Program 2: verify number is palindrom or not.
input : 121121 */

package sadhana;

import java.util.Scanner;

public class Assignment34_NumberPalindrome {

	void printData(int number) {
		int originalNumber = number;
		int reminder = 0;
		int reversedNumber = 0;

		for (; number != 0;) {
			reminder = number % 10;
			reversedNumber = reversedNumber * 10 + reminder;
			number = number / 10;
		}
		System.out.println("Reversed Number : " + reversedNumber);
		if (originalNumber == reversedNumber) {
			System.out.println("Number " + originalNumber + " is a palindrome");
		} else {
			System.out.println("Number " + originalNumber + " is not a palindrome");
		}
	}

	public static void main(String[] args) {
		Assignment34_NumberPalindrome np = new Assignment34_NumberPalindrome();
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		np.printData(num);
	}
}
