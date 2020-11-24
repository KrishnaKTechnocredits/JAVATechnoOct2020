package ankit;

import java.util.Scanner;

public class StringWithNoDigit {

	void stringWithNoDigitLogic(String word) {
		String tempWord = "";
		boolean flag = false;
		for (int index = 0; index < word.length(); index++) {
			char character = word.charAt(index);
			tempWord = tempWord + character;
			if (Character.isDigit(character)) {
				tempWord = "";
				flag = true;
			}	
		}
		if (flag) {
			tempWord = "";
		}
		if(tempWord!="")
	 System.out.println("String without digit is : " + tempWord);
}
	void passingArrayToMainLogic(String[] words) {
		String word = "";
		for (int index = 0; index < words.length; index++) {
			word = words[index];
			stringWithNoDigitLogic(word);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many string user want to enter: ");
		int length = scanner.nextInt();
		String[] words = new String[length];

		for (int index = 0; index < length; index++) {
			System.out.println("Enter the string " + (index + 1));
			String word = scanner.next();
			words[index] = word;
		}
		StringWithNoDigit stringWithNoDigit = new StringWithNoDigit();
		stringWithNoDigit.passingArrayToMainLogic(words);
		scanner.close();
	}
}
