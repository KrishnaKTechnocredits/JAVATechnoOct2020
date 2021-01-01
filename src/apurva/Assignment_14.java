package apurva;

import java.util.Scanner;

//Find the frequency of character from a given string array.
public class Assignment_14 {
	int frequency(String word, char ch) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == ch)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Assignment_14 assignment_14 = new Assignment_14();
		System.out.println("Enter word");
		String word = scanner.next();
		System.out.println("Enter Character");
		String temp = scanner.next();
		char ch = temp.charAt(0);
		int counter = 1;
		while (temp.length() != 1 && counter < 3) {
			System.out.println("Attempt left " + (3 - counter));
			temp = scanner.next();
			ch = temp.charAt(0);
			counter++;
		}
		if (temp.length() != 1)
			System.out.println("Try sometime later");
		else {
			int count = assignment_14.frequency(word, ch);
			System.out.println(" Number of Character " + ch + " occour in " + word + " is " + count + " time's ");
		}
		scanner.close();
	}
}