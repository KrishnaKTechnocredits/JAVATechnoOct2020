package vishakha;

import java.util.Scanner;

public class CharFrequencyInWord {

	void findFrequency(String word, char ch){
		int countFreq = 0;
		for(int index=0; index<word.length(); index++){
			if(word.charAt(index) == ch)
				countFreq++;
		}
		System.out.println("Character "+ch+ " was found "+countFreq+ " times");

	}


	public static void main(String[] args) {
		CharFrequencyInWord charFrequencyInWord = new CharFrequencyInWord();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String word = scanner.next();
		System.out.println("Enter a character to check its frequency from the word : ");
		String character = scanner.next();
		int count = 1;
		while(character.length() != 1 && count < 3){
			System.out.println("Please enter a single character.");
			System.out.println("Last "+ (3-count) + " attempts left");
			character = scanner.next();
			count++;
		}
		if(character.length() != 1)
			System.out.println("You entered wrong input and exceeded the maximim limit. Please try after sometime.");
		else{
			char ch = character.charAt(0);
			System.out.println("Character is " +ch);
			charFrequencyInWord.findFrequency(word, ch);
		}
	}
}
