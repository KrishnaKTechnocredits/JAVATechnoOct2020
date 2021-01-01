/* Assignment 34: [complete it before 4th Dec EOD] 

Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.*/

package kajol;

import java.util.Scanner;

public class PalindromeString {
	
	boolean verifyPalindromeString(String inputString) {
		
		for(int index=0,reverseIndex=inputString.length()-1;index<reverseIndex;index++,reverseIndex--) {
			if(inputString.charAt(index)!= inputString.charAt(reverseIndex))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a String:");
		String string=sc.next();
		boolean flag=new PalindromeString().verifyPalindromeString(string);
		if(flag)
			System.out.println(string+" is Palindrome String.");
		else
			System.out.println(string+" is not Palindrome String.");
		sc.close();
	}

}
