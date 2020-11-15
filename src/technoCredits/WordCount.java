package technoCredits;

public class WordCount {

	void freqOfWord(String input) {
		String[] arr = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			String word = arr[i];
			if (!word.equals("")) {
				for (int j = 0; j < arr.length; j++) {
					if (word.equals(arr[j])) {
						count++;
						arr[j] = "";
					}
				}
				System.out.println(word + "->" + count);
			}
			// input.replace(word, "");
			// }
		}
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Hello";
		new WordCount().freqOfWord(input);
	}
}
