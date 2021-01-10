package priyanka.Assignment49;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
1) Read file and print total frequency of "Technocredits" word.
2) Read file and print frequency of "Technocredits" word in each line.
*/

public class FileHandling {

	public static void main(String[] args) throws FileNotFoundException {
		int totalCount = 0;
		Scanner scanner = new Scanner(new File("src//priyanka//assignment49//File.txt"));
		while (scanner.hasNextLine()) {
			String[] splitted = scanner.nextLine().split(" ");
			int count = 0;
			for (String value : splitted) {
				if (value.equals("Technocredits")) {
					count++;
					totalCount++;
				}
			}
			System.out.println("Frequency of Technocredits: " + count);
		}
		System.out.println("Total Frequency of Technocredits: " + totalCount);
		scanner.close();
	}

}
