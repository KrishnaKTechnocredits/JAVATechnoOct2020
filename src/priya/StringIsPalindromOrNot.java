//Program 1:  verify string is palindrom or not.
//input : naman///output : naman is a palindrom string.
//input : techno///output : techno is not a palindrom string.

package priya;

public class StringIsPalindromOrNot {

	void palindromOrNotPalindrom(String input) {
		String wordreverse = "";
		for (int i = input.length() - 1; i >= 0; i--)
			wordreverse = wordreverse + input.charAt(i);
		if (input.equals(wordreverse))
			System.out.println(input+ " String is a palindrom");
		else
			System.out.println(input+ " String is not a palindrom");
	}

	public static void main(String[] args) {
		StringIsPalindromOrNot stringispalindromornot = new StringIsPalindromOrNot();
		stringispalindromornot.palindromOrNotPalindrom("Naman");
		stringispalindromornot.palindromOrNotPalindrom("Techno");

	}
	
}
