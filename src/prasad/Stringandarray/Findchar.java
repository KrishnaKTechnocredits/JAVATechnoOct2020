package prasad.Stringandarray;

import java.util.Scanner;

/*Program 1: Find the frequency of character from a given String array. */

public class Findchar {
	static int totalcount;

	void searchchar(String[] array, char ch) {
		int localcount = 0;
		for (int index = 0; index <= array.length - 1; index++) {
			String word = array[index];
			for (int index1 = 0; index1 <= word.length() - 1; index1++) {
				if (word.charAt(index1) == ch) {
					totalcount++;
					localcount++;
				}
			} 
			System.out.println("Count of " + ch + " in " + array[index] + " is " + localcount);
		}
		System.out.println("Total occurance of " + ch + " : " + totalcount);
	}

	public static void main(String[] arg) {
		Findchar findchar = new Findchar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many words do you wish to enter: ");
		int count = scanner.nextInt();
		String[] words = new String[count];

		for (int index = 0; index < count; index++) {
			System.out.println("Please enter string:");
			words[index] = scanner.next();
		}
		System.out.println("Please enter which char you want to search in above entered strings: ");
		char chr = scanner.next().charAt(0);
		findchar.searchchar(words, chr);
	}

}
