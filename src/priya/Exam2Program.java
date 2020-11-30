//Exam 2 : WAP for below given requirement. [30][45]
//input : teCh@N12JCR#iT8s_B
//output : letters -> 12
//uppercase -> 7
//lowercase -> 5
//digit -> 3
//special char -> 3

package priya;

import java.util.Scanner;

public class Exam2Program {

	int letter = 0,uppercase = 0, lowercase = 0,digit = 0,special = 0;
	void showDetails(String name) {

		for (int index = 0; index < name.length(); index++) {
			char character = name.charAt(index);
			if (Character.isLetter(character)) {
				letter++;
				if (Character.isUpperCase(character))
					uppercase++;
				else
					lowercase++;
			} else if (Character.isDigit(character))
				digit++;
			else
				special++;
		}
		System.out.println("Letters: " + letter + "\nUpperCase Characters: " + uppercase + "\nLowercase Characters: "
				+ lowercase + "\nDigits: " + digit + "\nSpecial Characters: " + special);
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string:");
		new Exam2Program().showDetails(scanner.nextLine());
		scanner.close();

	}
}
