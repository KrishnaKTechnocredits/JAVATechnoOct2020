package prasad.collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/*Assignment - 45 : 27th Dec'2020

Print all the words having frequency less than or equal to 2.
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Techno -> 2
Credits -> 1*/

public class PrintWorLesThanGivFreq {
	static LinkedHashMap<String, Integer> getWordCount(String[] arry) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (int index = 0; index < arry.length; index++) {
			String word = arry[index];
			if (map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, count + 1);
			} else {
				map.put(word, 1);
			}
		}
		return map;
	}

	static void printWords(LinkedHashMap<String, Integer> map, int count) {
		System.out.println("Printing words with frequency less than or equal to " + count);

		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() <= count) {
				System.out.println(entry.getKey() + " -> " + entry.getValue());
			}
		}
	}
	


	public static void main(String[] arg) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		String[] words = input.split(" ");
		LinkedHashMap<String, Integer> output = PrintWorLesThanGivFreq.getWordCount(words);
		PrintWorLesThanGivFreq.printWords(output, 2);
	}
}
