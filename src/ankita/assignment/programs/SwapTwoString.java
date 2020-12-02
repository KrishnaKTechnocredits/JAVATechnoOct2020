//swap 2 String with using 3rd variable
package ankita.assignment.programs;

import java.util.Scanner;

public class SwapTwoString {
	void getSwappedString(String str1, String str2) {
		String temp = "";
		System.out.println("String1=" + str1 + " String2=" + str2);
		temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("String1=" + str1 + " String2=" + str2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1 : ");
		String str1 = sc.next();
		System.out.println("Enter String2 : ");
		String str2 = sc.next();

		new SwapTwoString().getSwappedString(str1, str2);
	}
}