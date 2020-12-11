package ankit.Scanner;

import java.util.Scanner;

public class CharacterOccurance {

	void verification(String arr, char word, int length) {
		int counter = 0;
		for (int index = 0; index < length; index++)
			if (arr.charAt(index) == word) {
				counter++;
			}
		System.out.println(word +" is present in string " +counter+ " times");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which String user want to enter for the character occurance");
		String string = scanner.next();
		int length = string.length();
		System.out.println("Which character you want to check in the string");
		char word = scanner.next().charAt(0);
		CharacterOccurance characterOccurance = new CharacterOccurance();
		characterOccurance.verification(string, word, length);
		scanner.close();
	}

}
