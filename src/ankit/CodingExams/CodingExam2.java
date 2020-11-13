package codingExams;

import java.util.Scanner;

public class CodingExam2 {

		void codingExam2(String word) {
			int letterCounter=0;
			int upperCaseCounter=0;
			int lowerCaseCounter=0;
			int specialCharCounter = 0;
			int digitCounter = 0;
		
		for (int index = 0; index < word.length(); index++) {
			char character = word.charAt(index);
			if (Character.isLetter(character)) {
				letterCounter++;
				if (Character.isUpperCase(character))
					upperCaseCounter++;
				else
					lowerCaseCounter++;
			} else if (Character.isDigit(character))
				digitCounter++;
			else
				specialCharCounter++;
		}
		System.out.println("Number of letter in word is: " +letterCounter);
		System.out.println("Number of upper case word in word is: " +upperCaseCounter);
		System.out.println("Number of lower case word in word is: " +lowerCaseCounter);
		System.out.println("Number of digits in word is: " +digitCounter);
		System.out.println("Number of special character in word is: " +specialCharCounter);
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String word = scanner.next();
		CodingExam2 codingExam2 = new CodingExam2();
		codingExam2.codingExam2(word);

	}

}
