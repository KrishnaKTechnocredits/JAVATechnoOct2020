package sessionPractice;

import java.util.Scanner;

public class PracticeScanner {

	String displayMaximumStringName(String[] names) {
		int nameLength = names[0].length();
		String maxName = names[0];
		for (int index = 0; index < names.length; index++) {
			// System.out.println(names[index]);
			if (names[index].length() > nameLength) {
				nameLength = names[index].length();
				maxName = names[index];
			}

		}
		System.out.println("Max name out of user provided list: " + maxName);
		System.out.println("Maximum Length of Max Name: " +nameLength);
		return maxName;
	}

	void displayEvenCharcterOfString(String maxName) {

		System.out.println("Even characters of provided String from method " + maxName);
		for (int index = 0; index < maxName.length(); index++) {
			if (index % 2 != 0)
				System.out.print(maxName.charAt(index));
		}
	}



	public static void main(String[] args) {
		PracticeScanner practiceScanner = new PracticeScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("User wants to enter the list of name ");
		int length = scanner.nextInt();
		System.out.println("Enter the names of user");
		String[] names = new String[length];

		for (int index = 0; index < length; index++) {
			names[index] = scanner.next();
		}
		String maxName = practiceScanner.displayMaximumStringName(names);
		practiceScanner.displayEvenCharcterOfString(maxName);
	}

}
