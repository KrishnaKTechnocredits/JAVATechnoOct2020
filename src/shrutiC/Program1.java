package shrutiC;

import java.util.Scanner;

public class Program1 {

	void getCharFrequencyInArray(String[] nameArray, char character) {

		int totalCharCount = 0;

		for (int index = 0; index < nameArray.length; index++) {
			int charCount = 0;
			String name = nameArray[index];
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == character) {
					charCount++;
					totalCharCount++;
				}
			}
			System.out.println(name + " - " + charCount);
		}
		System.out.println("Total occurrence of e - " + totalCharCount);
	}

	public static void main(String[] args) {

		Program1 program = new Program1();
		System.out.println("Enter the number of data to be entered : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String[] array = new String[num];

		for (int index = 0; index < num; index++) {
			System.out.println("Enter name " + (index + 1));
			array[index] = scanner.next();
		}

		System.out.println("Enter the character whose frequency is to be found : ");
		char c = scanner.next().charAt(0);

		program.getCharFrequencyInArray(array, c);
	}

}
