package tejashree;

import java.util.Scanner;

/*Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.
*/

public class Assignment34_Program1 {

	void stringPalindrom(String string) {
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}
		if (string.equals(reverse))
			System.out.println(" This String Is Palindrome String");
		else
			System.out.println(" This String Is Not Palindrome String");
	}
	public static void main(String[] args) {
		Assignment34_Program1 stringPalindrome = new Assignment34_Program1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String");
		String string = scanner.next();
		stringPalindrome.stringPalindrom(string);
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter The String");
		String string1 = scanner.next();
		stringPalindrome.stringPalindrom(string1);
	}
}