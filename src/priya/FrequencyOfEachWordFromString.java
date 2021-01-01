//Assignment : 44 [24th Dec'2020]: Program 1:
//Find frequency of each word from the String
//String str1 = "hello gm hi gm hello pune gn";

package priya;

import java.util.HashMap;

public class FrequencyOfEachWordFromString {

	HashMap<String, Integer> findFrequency(String array) {
		String[] word = array.split(" ");
		HashMap<String, Integer> charfreq = new HashMap<String, Integer>();
		for (int index = 0; index < word.length; index++) {
			String name = word[index];

			if (charfreq.containsKey(name)) {
				int count = charfreq.get(name);
				charfreq.put(name, count + 1);
			} else {
				charfreq.put(name, 1);
			}
		}
		return charfreq;
	}

	public static void main(String[] args) {

		String input = "hello gm hi gm hello pune gn";
		FrequencyOfEachWordFromString frequencyofeachwordfromstring = new FrequencyOfEachWordFromString();
		HashMap<String, Integer> charfrequency = frequencyofeachwordfromstring.findFrequency(input);
		System.out.println("Char frequency is: " + charfrequency);
	}

}
