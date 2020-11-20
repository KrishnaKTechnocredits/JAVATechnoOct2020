package tejashree;

/*max repeating word with its freq.
	input : Hi Hello Hi Techno Hello Hi
	output : Hi -> 3*/
public class MaxepatedWord {

	void WordFrequency(String inputString) {
		int max = 0;
		String maxOccuringWord = null;
		String[] inputSplitedArray = inputString.split(" ");
		for (int index = 0; index < inputSplitedArray.length; index++) {
			String matchWord = inputSplitedArray[index];
			int freqCount = 0;
			if (inputString.contains(matchWord)) {
				for (int occurenceIndex = 0; occurenceIndex < inputSplitedArray.length; occurenceIndex++) {
					if (matchWord.equals(inputSplitedArray[occurenceIndex]))
						freqCount++;
				}
			}
			if (freqCount > max) {
				max = freqCount;
				maxOccuringWord = inputSplitedArray[index];
			}
			inputString = inputString.replace(maxOccuringWord, " ");
		}
		System.out.println("Maximum occuring word is '" + maxOccuringWord + "and no of times it is repeated is " + max + " times.");
	}

	public static void main(String[] args) {
		String inputString = "Hi Hello Hi Techno Hello Hi";
		new MaxepatedWord().WordFrequency(inputString);
	}

}