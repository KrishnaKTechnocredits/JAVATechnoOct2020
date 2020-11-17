/*Program : 1
max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/
package shrutiS.assignment18;

public class MaxFrequencyCharacter {
	int maxFrequency;
	String word;
	void maxFrequencyCharCount(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
		    word = arr[index];
			int count = 0;
			if (input.contains(word)) {
				for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
					if (word.equals(arr[innerIndex])) {
						count++;
					}
				}
				//System.out.println(word + " occurs " + count + " times");
				input = input.replace(word, "");
				if (maxFrequency < count)
					maxFrequency = count;
			}
		}
		System.out.println("Word with maximum occurance is '"+word+"' of frequency "+maxFrequency);
	}

	public static void main(String[] args) {
		MaxFrequencyCharacter maxFreqChar = new MaxFrequencyCharacter();
		String input = "Hi Hello Hi Techno Hello Hi";
		System.out.println("Input : {" + input + "}");
		maxFreqChar.maxFrequencyCharCount(input);
	}
}
