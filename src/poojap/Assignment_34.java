/*Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.
*/

package poojap;

import java.util.Scanner;

public class Assignment_34 {

	void stringPalindrom(String string) {
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}
		// System.out.println(reverse);
		if (string.equals(reverse))
			System.out.println(" This String Is Palindrom String");
		else
			System.out.println(" This String Is Not Palindrom String");
	}

	public static void main(String[] args) {

		Assignment_34 assignment_34 = new Assignment_34();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String");
		String string = scanner.next();
		assignment_34.stringPalindrom(string);
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter The String");
		String string1 = scanner.next();
		assignment_34.stringPalindrom(string1);
	}
}
