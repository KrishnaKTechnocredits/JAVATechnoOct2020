//Find the frequency of character from a given String array.
package priya;

import java.util.Scanner;

public class StringFrequency {
	int totalcount;

	void checkFrequency(String[] nameArray, char ch) {
		for (int index = 0; index < nameArray.length; index++) {
			int count = 0;
			String name = nameArray[index];
			for (int index1 = 0; index1 < name.length(); index1++) {
				if (name.charAt(index1) == ch) {
					count++;
					totalcount++;
				}
			}
			if (count > 0)
				System.out.print("Frequency of char " + ch + " in word " + name + " is : " + count);
		}
		System.out.println("Total occurence of character " + ch + "in aaray is:" + totalcount);

	}

	public static void main(String[] args) {
		StringFrequency stringfrequency = new StringFrequency();
		int count = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many names you want to enter ? ");
		int arrLength = scanner.nextInt();
		String[] nameArray = new String[arrLength];
		for (int index = 0; index < arrLength; index++) {
			System.out.println("Enter " + (index + 1) + " name ");
			nameArray[index] = scanner.next();
		}
		System.out.println("Enter character to check the frequency ");
		String name = scanner.next();
		while ((name.length()) != 1 && count < 3) {
			System.out.println("Enter a single character");
			name = scanner.next();
			count++;
		}
		if ((name.length()) != 1)
			System.out.println("Entered invalid character. Please try after sometime");
		else {
			char ch = name.charAt(0);
			stringfrequency.checkFrequency(nameArray, ch);
			scanner.close();
		}
	}
}