/*Find the frequency of character from a given String array.
Note: Take String and character from the user */

package poojap;

import java.util.Scanner;

public class Assignment_14 {

	int freqCharacter(String string, char ch) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ch)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment_14 assignment14 = new Assignment_14();
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter The String: ");
		String string = scanner1.next();
		System.out.println("Enter The character: ");
		char ch = scanner1.next().charAt(0);
		int count = assignment14.freqCharacter(string, ch);
		System.out.println("The Frequency of " + ch + " is: " + count);
	}
}
