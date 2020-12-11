package priyanka.Assignment34;

/*Program 2: verify number is palindrom or not.
input : 121121*/

import java.util.Scanner;

public class PalindromeInteger {

	void isPalindrome(int num) {
		boolean flag = true;
		String str = String.valueOf(num);
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if (ch1 != ch2) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("The Given String is Palindrome");
		else
			System.out.println("The Given String is not Palindrome");
	}

	public static void main(String[] arg) {
		PalindromeInteger palindromeInteger = new PalindromeInteger();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		palindromeInteger.isPalindrome(num);
		System.out.println("Enter the Number");
		int num1 = scanner.nextInt();
		palindromeInteger.isPalindrome(num1);
	}
}
