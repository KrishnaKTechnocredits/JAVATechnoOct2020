//max repeating word with its freq.
//input : Hi Hello Hi Techno Hello Hi
//output : Hi -> 3

package priya;

public class MaxRepeatingWord {
	void freqOfWord(String input) {
		String[] arr = input.split("");
		int max = 0;
		String maxword = "";
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			int count = 0;
			if (!word.equals("")) {
				for (int j = 0; j < arr.length; j++) {
					if (word.equals(arr[j]))
						count++;
					arr[j] = "";
				}
			}
			if (max < count) {
				max = count;
				maxword = word;
			}
			System.out.println(maxword + " -> " + max);
		}
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Hello Hi";
		MaxRepeatingWord maxrepeatingword = new MaxRepeatingWord();
		maxrepeatingword.freqOfWord(input);
	}

}
