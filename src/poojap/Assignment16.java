package poojap;

import java.util.Scanner;

public class Assignment16 {

	void frequency(String string) {
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			int cnt = 0;
			for (int j = 0; j < string.length(); j++) {
				if (string.charAt(j) == ch) {
					cnt++;
				}
			}
			System.out.println("Character " + ch + " Occurance:" + cnt + " times");

		}
	}

	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = scanner.next();
		assignment16.frequency(input);

	}

}
