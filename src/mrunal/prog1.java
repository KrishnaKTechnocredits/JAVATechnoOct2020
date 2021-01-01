package mrunal;
/*
Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.
 */

public class prog1 {

	void verifyStringPalindrome(String input) {
		System.out.println("Input: " + input);
		boolean flag = true;
		for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
			if (input.charAt(i) == input.charAt(j))
				continue;
			else {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(input + " is a Palindrome string");
		else
			System.out.println(input + " is not a Palindrome string");
	}
public static void main(String[] args) {
	    prog1 program1 = new prog1();
		program1.verifyStringPalindrome("naman");
		program1.verifyStringPalindrome("techno");
}
}
