package rohan;

import java.util.Scanner;

/*
 * Program 2: WAP to find two String are idential or not

input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not idential

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are idential
 */

public class IdenticalStrings {
	
	public static void main(String[] args) {
		IdenticalStrings identicalStrings = new IdenticalStrings();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String str1 = sc.next();
		System.out.println("Enter string 2: ");
		String str2 = sc.next();
		identicalStrings.findIdenticalStrings(str1,str2);
	}
	
	void findIdenticalStrings(String str1,String str2) {
		boolean flag = true;
		if(str1.length() == str2.length()) {
			for(int index=0;index<str1.length();index++) {
				if(str1.charAt(index) != str2.charAt(index)) {
						flag = false;
						break;
				}
				else {
					if(str1.charAt(index) == str2.charAt(index) && Character.isLowerCase(str1.charAt(index))==Character.isLowerCase(str2.charAt(index)) || Character.isUpperCase(str1.charAt(index))==Character.isUpperCase(str2.charAt(index)))
						flag = true;
				}
			}
			if(flag)
				System.out.println("Strings are identical");
			else
				System.out.println("Strings are not identical");
		}
		else
			System.out.println("Strings are not identical");
	}
}
