package tejashree;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of names");
		int arrLength = sc.nextInt();
		String[] names = new String[arrLength];
		for (int index = 0; index < arrLength; index++) {
			System.out.println("Enter name" + (index + 1));
			names[index] = sc.next();
		}
		String maxLengthName = Exam1.getMaxLength(names, arrLength);
		Exam1.printAllEvenChar(maxLengthName, arrLength);

	}

	static String getMaxLength(String[] names, int arrLength) {
		int maxLength = names.length;
		String maxLengthName = names[0];
		for (int index = 0; index < arrLength; index++) {
			if (names[index].length() > maxLength) {
				maxLength = names[index].length();
				maxLengthName = names[index];
			}
		}
		System.out.println("Max length name-->" + maxLengthName + " the length of the name is " + maxLength);
		return maxLengthName;
	}

	static void printAllEvenChar(String maxLengthName, int arrLength) {
		for (int index = 0; index > arrLength; index++) {
			if (index % 2 != 0)
				System.out.println(maxLengthName.charAt(index));
		}
	}

}
