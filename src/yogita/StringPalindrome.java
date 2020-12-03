/*
Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.
*/
package yogita;

import java.util.Scanner;

public class StringPalindrome {
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
			System.out.println("Given String is:Palindrome");
		else
			System.out.println("Given String is:Not Palindrome");
	}

	public static void main(String[] args) {
		StringPalindrome findPalindrome = new StringPalindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		findPalindrome.isPalindrome(str);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("\nEnter String");
		String str1= sc1.next();
		findPalindrome.isPalindrome(str1);
	}
}