/* Assignment-18 : 14th Nov'2020 

Program : 1
max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/
package suvela;

public class FindWordWithMaxFreq {
	int maxcount = 0;

	void findWord(String words) {
		String op = null;
		String[] array = words.split(" ");
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			String word = array[i];
			if (words.contains(word)) {
				for (int j = 0; j < array.length; j++) {
					if (word.equals(array[j])) {
						count++;
						if (maxcount < count) {
							maxcount = count;
							op = array[j];

						}
					}
				}
				
				words = words.replace(word, "");
			}
		}
		System.out.println(op + ":>" + maxcount);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Hello Hi";
		FindWordWithMaxFreq max = new FindWordWithMaxFreq();
		max.findWord(input);
	}

}
