/*Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.*/

package sadhana;

import java.util.Scanner;

class Assignment34_StringPalindrom {

	void printData(String str) {
		String rev = "";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		if (str.equals(rev))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");
	}

	public static void main(String args[]) {
		Assignment34_StringPalindrom sp = new Assignment34_StringPalindrom();
		String str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		str1 = sc.nextLine();
		sp.printData(str1);
	}
}
