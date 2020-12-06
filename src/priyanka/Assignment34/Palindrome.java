package priyanka.Assignment34;

/*Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.*/

import java.util.Scanner;

public class Palindrome {

	void findPalindromeWithRevStr(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev))

			System.out.print("The Given String is Palindrome");
		else
			System.out.print("The Given String is not Palindrome");
	}

	void isPalindrome(String name) {
		boolean flag = true;
		for (int i = 0, j = name.length() - 1; i < j; i++, j--) {
			char ch1 = name.charAt(i);
			char ch2 = name.charAt(j);
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
		Palindrome palindrome = new Palindrome();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.next();
		palindrome.findPalindromeWithRevStr(str);
		System.out.println();
		System.out.println("Enter the String");
		String str1 = scanner.next();
		palindrome.isPalindrome(str1);
	}
}
