/*/*Program 1: verify string is palindrom or not.
input : naman
output : naman is a palindrom string.
input : techno
output : techno is not a palindrom string.
*/
package suvela.assignment34;

public class PalindromeString {
	void findPalindrome(String word) {
		System.out.println("============Method 1===========");
		boolean flag = true;
		for (int i = 0, j = word.length() - 1; j > i; i++, j--) {
			if (word.charAt(i) != word.charAt(j)) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("String " + word + " is palindrome");
		else
			System.out.println("String " + word + " is not palindrome");
	}

	void findPalindrome2(String word) {
		System.out.println("=========Method 2===========");
		String rev = "";
		for (int i = word.length() - 1; i > 0; i--) {
			rev += word.charAt(i);
		}
		if (word.equals(rev))
			System.out.println("\"String \" + word + \" is palindrome\"");
		else
			System.out.println("String " + word + " is not palindrome");
	}

	void findPalindrome3(String word) {
		System.out.println("===========Method 3============");
		String str = "";
		String s = "";
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i)))
				s += Character.toLowerCase(word.charAt(i));
			else
				s += word.charAt(i);
		}
		for (int j = word.length() - 1; j >= 0; j--) {
			if (Character.isUpperCase(word.charAt(j)))
				str += Character.toLowerCase(word.charAt(j));
			else
				str += word.charAt(j);
		}
		if (s.equals(str))
			System.out.println("String " + word + " is palindrome");
		else
			System.out.println("String " + word + " is not palindrome");
	}

	public static void main(String[] args) {
		String word = "naman";
		String word2 = "techno";
		String word3 = "Naman";
		PalindromeString ps = new PalindromeString();
		ps.findPalindrome(word);
		ps.findPalindrome2(word2);
		ps.findPalindrome3(word3);
	}

}
