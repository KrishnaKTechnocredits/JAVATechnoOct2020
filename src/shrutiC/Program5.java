package shrutiC;

import java.util.Scanner;

public class Program5 {

	void findFreqOfVowelsInWord(String word) {
		int vowelFreq = 0;
		int eCount = 0, aCount = 0, iCount = 0, oCount = 0, uCount = 0;

		System.out.print("Vowels in word " + word + " are - ");
		for (int index = 0; index < word.length(); index++) {
			char character = word.charAt(index);
			switch (character) {
			case 'a':
			case 'A':
				aCount++;
				if (aCount == 1)
					System.out.print("a ");
				break;
			case 'e':
			case 'E':
				eCount++;
				if (eCount == 1)
					System.out.print("e ");
				break;
			case 'i':
			case 'I':
				iCount++;
				if (iCount == 1)
					System.out.print("i ");
				break;
			case 'o':
			case 'O':
				oCount++;
				if (oCount == 1)
					System.out.print("o ");
				break;
			case 'u':
			case 'U':
				uCount++;
				if (uCount == 1)
					System.out.print("u ");
				break;
			}
		}
		vowelFreq = aCount + eCount + iCount + oCount + uCount;
		System.out.println("\nTotal number of vowels are : " + vowelFreq);
	}

	public static void main(String[] args) {
		Program5 program = new Program5();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word : ");
		String word = scanner.next();
		program.findFreqOfVowelsInWord(word);
	}

}
