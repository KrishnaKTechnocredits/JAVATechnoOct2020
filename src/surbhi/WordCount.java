package surbhi;
public class WordCount {

	void wordFrequencyCount(String string) {
		System.out.println("Given string: " + string);
		int max = 0, maxWordIndex = 0;
		String[] strArray = string.split(" ");
		for (int index = 0; index < strArray.length; index++) {
			String word = strArray[index];
			int counter = 0;
			if (string.contains(word)) {
				for (int innerIndex = 0; innerIndex < strArray.length; innerIndex++) {
					if (word.equals(strArray[innerIndex])) {
						counter += 1;
					}
				}
				if (counter > max) {
					max = counter;
					maxWordIndex = index;
				}
				string = string.replace(word, "");
			}
		}
		System.out.println("Word with maximum frequency: " + strArray[maxWordIndex] + " ---> " + max);
	}

	public static void main(String[] args) {
		WordCount wordcount = new WordCount();
		wordcount.wordFrequencyCount("Hi Hello Hi Techno Hello Hi");
	}

}
