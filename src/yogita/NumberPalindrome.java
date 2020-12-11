/*
Program 2: verify number is palindrom or not.
input : 121121
*/

package yogita;

import java.util.Scanner;

public class NumberPalindrome {
	void isPalindrome(int num) {
		int temp = num;
		int remainder = 0;
		int reverse = 0;
		while (num != 0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}
		if (temp == reverse)
			System.out.println("Given Number is:Palindrome");
		else
			System.out.println("Given Number is:Not Palindrome");
	}

	public static void main(String[] args) {
		NumberPalindrome findPalindrome = new NumberPalindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int input = sc.nextInt();
		findPalindrome.isPalindrome(input);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("\nEnter Number");
		int input1 = sc1.nextInt();
		findPalindrome.isPalindrome(input1);
	}
}