package ritika.Assignments;

/*Assignment 34: [complete it before 4th Dec EOD]

Program 1: verify string is palindrome or not.
input : naman
output : naman is a palindrome string.
input : techno
output : techno is not a palindrome string.

Program 2: verify number is palindrome or not.
input : 121121
*/
public class Asgmt_34 {

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

	void verifyNumberPalindrome(int input) {
		System.out.println("Input: " + input);
		String strInput = String.valueOf(input);
		boolean flag = true;
		for (int i = 0, j = strInput.length() - 1; i < j; i++, j--) {
			if (strInput.charAt(i) == strInput.charAt(j))
				continue;
			else {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(input + " is a Palindrome number");
		else
			System.out.println(input + " is not a Palindrome number");
	}

	public static void main(String[] args) {
		Asgmt_34 program1 = new Asgmt_34();
		program1.verifyStringPalindrome("naman");
		program1.verifyStringPalindrome("techno");
		System.out.println("=================================");
		Asgmt_34 program2 = new Asgmt_34();
		program2.verifyNumberPalindrome(121121);
		program2.verifyNumberPalindrome(125367);
	}
}
