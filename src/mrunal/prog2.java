package mrunal;
/*	Program 2: verify number is palindrome or not.
input : 121121
*/
public class prog2 {
	
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
		prog2 program2 = new prog2();
		program2.verifyNumberPalindrome(121121);
		program2.verifyNumberPalindrome(125367);
	}
}