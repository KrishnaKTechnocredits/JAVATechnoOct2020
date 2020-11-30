package apurva;

import java.util.Scanner;

public class Exam_2 {
	void displayData(String str) {
		int letterCount = 0, upperCaseCount = 0, lowerCaseCount = 0, digitCount = 0, specialCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char character = str.charAt(index);
			if (Character.isLetter(character)) {
				letterCount++;
				if (Character.isUpperCase(character))
					upperCaseCount++;
				else
					lowerCaseCount++;
			} else if (Character.isDigit(character))
				digitCount++;
			else
				specialCount++;
		}
		System.out.println(" Letters: " + letterCount + " , " + " UpperCase Characters: " + upperCaseCount + " , " +  " Lowercase Characters: "
						+ lowerCaseCount + " , " + " Digits: " + digitCount + " , " + " Special Characters: " + specialCount);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string:");
		new Exam_2().displayData(scanner.nextLine());
		scanner.close();
	}

}