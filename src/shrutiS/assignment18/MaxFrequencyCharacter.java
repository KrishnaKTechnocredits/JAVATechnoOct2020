package shrutiS.assignment18;

public class MaxFrequencyCharacter {

	void maxFrequencyCharCount(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			int count = 0;
			if (input.contains(word)) {
				for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
					if (word.equals(arr[innerIndex]))
						count++;
				}
				System.out.println(word + " occurs " + count + " times");
				input = input.replace(word, "");
			}
		}
	}

	public static void main(String[] args) {
		MaxFrequencyCharacter maxFreqChar = new MaxFrequencyCharacter();
		String input = "Hi Hello Hi Techno Hello Hi";
		System.out.println("Input : {" + input + "}");
		maxFreqChar.maxFrequencyCharCount(input);
	}
}
