/*
Assignment - 47 : 27th Dec'2020
Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno   
*/
package mrunal;

public class replacingWord {

	void displayReplacedWord(String input, String enterWordToBeReplaced, String replacedWord) {
		int count = 0;
		String[] userInput = input.split(" ");
		for (int i = userInput.length - 1; i >= 0; i--) {
			if (userInput[i].equals(enterWordToBeReplaced)) {
				count++;
				if (count == 2) {
					userInput[i] = replacedWord;
					break;
				}
			}
		}
		for (String output : userInput) {
			System.out.print(output + " ");
		}
	}

	public static void main(String[] args) {

		replacingWord word = new replacingWord();
		String msg = "Hi globant Hello Hi Hi globant Hi Hello"
						+ " Hello globant Hi Techno Credits Techno";
		word.displayReplacedWord(msg, "Hi", "HAPPY");
	}
}