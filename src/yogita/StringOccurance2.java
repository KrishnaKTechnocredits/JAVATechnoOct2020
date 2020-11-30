package yogita;

import java.util.Scanner;

class StringOccurance2 {
	void charOccurance(String name, char ch) {
		int cnt = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch)
				cnt++;
		}

		System.out.println("Occurance of Character is: " + ch + " " + cnt+ " time");
	}

	public static void main(String[] args) {
		StringOccurance2 string = new StringOccurance2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = sc.next();
		System.out.println("Enter character which you want to search for occurance:");
		char ch = sc.next().charAt(0);
		string.charOccurance(word, ch);
	}
}