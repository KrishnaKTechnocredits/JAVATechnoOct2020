//Program : 4 : swap 2 String without using 3rd variable
package priya;

import java.util.Scanner;

public class SwapTwoStringWithoutUsingThirdVariable {
	void swapStringWithoutThirdVariable(String s1, String s2) {
		System.out.println("Before Swaping Value at num1 : "+ s1);
		System.out.println("Before Swaping Value at num2 : "+ s2);
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After Swaping Value at num1 : "+ s1);
		System.out.println("After Swaping Value at num2 : "+ s2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter First String: ");
		String str1 = scanner.next();
		System.out.println("Please Enter Second String: ");
		String str2 = scanner.next();
		SwapTwoStringWithoutUsingThirdVariable swapTwoStringWithoutThirdVariable = new SwapTwoStringWithoutUsingThirdVariable();
		swapTwoStringWithoutThirdVariable.swapStringWithoutThirdVariable(str1, str2);
		scanner.close();
	}
}
