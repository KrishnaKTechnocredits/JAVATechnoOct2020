package prem;

/*Find the frequency of character from a given String array.
Note: Take String and character from the user */

import java.util.Scanner;

public class Assignment14 {

	int freqCharacter(String string, char ch) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ch)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String: ");
		String string = scanner.next();
		System.out.println("Enter The character: ");
		char ch = scanner.next().charAt(0);
		int count = assignment14.freqCharacter(string, ch);
		System.out.println("The Frequency of " + ch + " is: " + count);
	}
}

