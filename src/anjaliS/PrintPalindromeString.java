package anjaliS;

public class PrintPalindromeString {
	void palindromeOrNotPalindrome(String word) {
		String wordreverse = "";
		for (int i = word.length() - 1; i >= 0; i--)
			wordreverse = wordreverse + word.charAt(i);
		if (word.equals(wordreverse))
			System.out.println("String is a palindrome.");
		else
			System.out.println("String isn't a palindrome.");
	}

	public static void main(String[] args) {
		PrintPalindromeString PrintPalindromeString = new PrintPalindromeString();
		PrintPalindromeString.palindromeOrNotPalindrome("naman");
		PrintPalindromeString.palindromeOrNotPalindrome("Techno");

	}

}
