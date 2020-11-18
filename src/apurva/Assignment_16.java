package apurva;

//Find the character and their corresponding frequencies

import java.util.Scanner;

public class Assignment_16 {
	void frequency(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch)
					count++;
			}
			System.out.println(" Character " + ch + " occurance " + count + " time's ");
				count =0;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Assignment_16 assignment_16 = new Assignment_16();
		System.out.println(" Enter String ");
		String word = scanner.next();
		assignment_16.frequency(word);
		scanner.close();
	}
}