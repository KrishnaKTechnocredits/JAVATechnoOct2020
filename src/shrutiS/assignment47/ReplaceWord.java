/*Assignment - 47 

Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno   */

package shrutiS.assignment47;

public class ReplaceWord {

	void replaceSecLastString(String input, String wordToBeReplaced, String newWord) {

		System.out.println("Input : " + input);
		String output = "";

		int index1 = input.lastIndexOf(wordToBeReplaced);
		String string1 = input.substring(0, index1);

		int index2 = string1.lastIndexOf(wordToBeReplaced);
		String subString2 = string1.substring(index2);
		subString2 = subString2.replace(wordToBeReplaced, newWord);

		output = input.substring(0, index2) + subString2 + input.substring(index1);

		System.out.println("Output : " + output);

	}

	public static void main(String[] args) {

		ReplaceWord obj = new ReplaceWord();
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		obj.replaceSecLastString(input, "Hi", "Shruti");
	}
}
