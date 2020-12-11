package rohan;

import java.util.Scanner;

/*
Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.
 */

public class PalindromeString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.next();
		isStringPalindrome(str);
		sc.close();
	}
	
	static void isStringPalindrome(String s) {
		boolean flag=false;
		for(int index=0,lastIndex=s.length()-1;index<lastIndex;index++,lastIndex--) {
			if(s.charAt(index) == s.charAt(lastIndex)) {
				flag = true;
			}
		}
		if(flag)
			System.out.println(s+" is palindrome string");
		else
			System.out.println(s+" is not palindrome String");
	}
}
