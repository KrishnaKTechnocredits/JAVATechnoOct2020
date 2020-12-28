package nagendra.collectionPrograms;

/*
Assignment - 47 : 27th Dec'2020
Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno   
*/

public class ReplaceTheWord {
	void getReplacedWord(String input, String wordToReplace, String replacedWord) {
		int count = 0;
		String[] userInput = input.split(" ");
		for (int i = userInput.length - 1; i >= 0; i--) {
			if (userInput[i].equals(wordToReplace)) {
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

		ReplaceTheWord word = new ReplaceTheWord();
		String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		word.getReplacedWord(msg, "Hi", "Nagendra");

	}
}
