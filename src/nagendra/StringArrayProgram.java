package nagendra;

import java.util.Scanner;

/*
Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              Total occurrence of e -> 5
*/

public class StringArrayProgram {

	void findFrequencyOfChar(String[] input, char word) {

		int count = 0;
		int totalCount = 0;
		for (int i = 0; i < input.length; i++) {
			String userString = input[i];
			for (int j = 0; j < userString.length(); j++) {
				if (userString.charAt(j) == word) {
					count++;
					totalCount++;
				}
			}
			if (count > 0) {
				System.out.println(
						"The Frequency of character " + word + " is " + count + " times in String " + userString + "");
			} else {
				System.out.println("The character " + word + " is not available in String "+userString+"");
			}
			count = 0;
		}
		System.out.println("Total Occourance of character " + word + " is " + totalCount + " times");
	}

	public static void main(String[] args) {
		StringArrayProgram classObject = new StringArrayProgram();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many String do you want in String Array");
		int input = scanner.nextInt();
		String[] userInput = new String[input];
		for (int i = 0; i < userInput.length; i++) {
			System.out.println("Input String:" + (i + 1) + " ");

			userInput[i] = scanner.next();
		}
		System.out.println("Enter the character2 who's frequecy is required:");
		String charToSearch = scanner.next();
		int counter = 1;
		while (charToSearch.length() != 1 && counter < 3) {
			System.out.println("Only " + (3 - counter) + " Attemps remaining");
			System.out.println(
					"Wrong input please try with single character otherwise first character from word would be picked!!");

			counter++;
			charToSearch = scanner.next();
		}
		char character = charToSearch.charAt(0);
		classObject.findFrequencyOfChar(userInput, character);
		scanner.close();
	}

}
