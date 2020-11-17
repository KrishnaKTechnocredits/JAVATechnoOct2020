package nagendra;

import java.util.Scanner;

/*
Find the frequency of each character from user given word.
*/
public class CharFrequency {

	void findFrequency(String word) {
		int counter = 0;
		for (int i = 0; i < word.length(); i++) {
			if( word.indexOf(word.charAt(i))==i){
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j) ) {
					counter++;
				}
			}
			System.out.println("The Character " + word.charAt(i) + " occured  ->" + counter + " times");
			counter = 0;
			}
		}
	}
	public static void main(String[] args) {
		CharFrequency frequency = new CharFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the String ");
		String userInput = scanner.next();
		frequency.findFrequency(userInput);
		scanner.close();
	}
}
