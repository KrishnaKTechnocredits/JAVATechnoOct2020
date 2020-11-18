/*Assignment-18 : 14th Nov'2020 

Program : 1
max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3 */

package poojap;

public class WordFrequency {
	int max = 0;
	String maxWord = null;

	void MaxWordfromArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			String word = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (word.equals(arr[j]) && i == word.indexOf(word))
					count++;
				if (max < count) {
					max = count;
					maxWord = word;
				}
			}
		}
		System.out.println("Max Frequency word is " + maxWord + "-->" + max);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Hello Hi Hi";
		String[] inputArr = input.split(" ");
		WordFrequency wordFrequency = new WordFrequency();
		wordFrequency.MaxWordfromArray(inputArr);
	}
}
