package technoCredits;

public class WordCount2 {

	void freqOfWord(String input) {
		String[] arr = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			String word = arr[i];
			if (input.contains(word)) {
				for (int j = 0; j < arr.length; j++) {
					if (word.equals(arr[j]))
						count++;
				}
				if(count == 2)
					System.out.println(word + "->" + count);
				input = input.replace(word, "");
			}
		}
		System.out.println(input);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Hello Hi";
		new WordCount2().freqOfWord(input);
	}
}
