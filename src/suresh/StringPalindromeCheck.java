package suresh;
// verify string is palindrom or not.
public class StringPalindromeCheck {
	static boolean palindromestring(String str) {

		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "naman";
		if (palindromestring(str))
			System.out.print(str + ":-> String value is Palindrome");
		else
			System.out.print(str + ":-->String value is not palindrome");
	}

}
