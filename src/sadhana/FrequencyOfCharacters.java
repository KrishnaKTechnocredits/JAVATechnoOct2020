package sadhana;

/* Assignment 14 : 10th Oct 2020 

Find the frequency of character from a given String array.
Note: Take String and character from the user. */

import java.util.Scanner;

class FrequencyOfCharacters {

	void frequency(String name, char ch) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("Frequency of " + ch + " is : " + count);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FrequencyOfCharacters FrequencyOfCharacters = new FrequencyOfCharacters();
		System.out.println("Enter String for check character frequency : ");
		String name = scanner.next();
		System.out.println("Enter Char for check frequncy : ");
		String temp = scanner.next();
		int count = 1;
		while (temp.length() != 1 && count < 3) {
			System.out.println("Please Enter only characters : ");
			temp = scanner.next();
			count++;
		}
		if (temp.length() != 1) {
			System.out.println("Invalid attempt");
		} else {
			char ch = temp.charAt(0);
			System.out.println(ch);
			FrequencyOfCharacters.frequency(name, ch);
		}
	}

}