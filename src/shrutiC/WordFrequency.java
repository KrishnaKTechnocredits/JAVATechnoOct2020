package shrutiC;

import java.util.Scanner;

public class WordFrequency {

	void findMaxWordFreq(String inputSentence) {

		String[] arrayStr = inputSentence.split(" ");
		int maxCounter = 0;
		int maxCounterIndex = 0;

		for (int index = 0; index < arrayStr.length; index++) {
			String word = arrayStr[index];
			int counter = 0;
			for (int i = 0; i < arrayStr.length; i++) {
				if (arrayStr[i].equals(word))
					counter++;
			}
			if (counter > maxCounter) {
				maxCounter = counter;
				maxCounterIndex = index;
			}
		}

		System.out.println(
				"'" + arrayStr[maxCounterIndex] + "' appears maximum times with frequency '" + maxCounter+"'");

	}

	public static void main(String[] args) {

		WordFrequency program = new WordFrequency();
		System.out.println("Enter a sentence : ");
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine(); // Hi Hello Hi Techno Hello Hi

		program.findMaxWordFreq(sentence);
	}

}
