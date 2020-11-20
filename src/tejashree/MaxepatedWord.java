package tejashree;

/*max repeating word with its freq.
	input : Hi Hello Hi Techno Hello Hi
	output : Hi -> 3*/
public class MaxepatedWord {

	void WordFrequency(String inputString) {
		int max = 0;
		String maxOccuringWord = null;
		String[] inputSplitArray = inputString.split(" ");
		for (int index = 0; index < inputSplitArray.length; index++) {
			String matchWord = inputSplitArray[index];
			int freqCount = 0;
			if (inputString.contains(matchWord)) {
				for (int occurenceIndex = 0; occurenceIndex < inputSplitArray.length; occurenceIndex++) {
					if (matchWord.equals(inputSplitArray[occurenceIndex]))
						freqCount++;
				}
			}
			if (freqCount > max) {
				max = freqCount;
				maxOccuringWord = inputSplitArray[index];
			}
			inputString = inputString.replace(maxOccuringWord, " ");
		}
		System.out.println("Maximum occuring word is '" + maxOccuringWord +"'"+"and no of times it is repeated is " + max + " times.");
	}

	public static void main(String[] args) {
		String inputString = "Hi Hello Hi Techno Hello Hi";
		new MaxepatedWord().WordFrequency(inputString);
	}

}