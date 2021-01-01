/*Program 1:  verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.*/

package shrutiS.assignment34;

public class StringPalindrom {

	void isStringPalindrom(String input) {
		String rev = "";

		for (int index = input.length() - 1; index >= 0; index--) {
			rev = rev + input.charAt(index);
		}
		if (input.equals(rev))
			System.out.println(input + " is a palindrome string");
		else
			System.out.println(input + " is not a palindrome string");
	}

	public static void main(String[] args) {
		StringPalindrom stringPalindrom = new StringPalindrom();
		String input1 = "naman";
		String input2 = "techno";
		System.out.println("Input :" + input1);
		stringPalindrom.isStringPalindrom(input1);
		System.out.println("**********************************************");
		System.out.println("Input :" + input2);
		stringPalindrom.isStringPalindrom(input2);
	}
}
