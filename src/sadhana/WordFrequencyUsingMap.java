package sadhana;

/*Assignment - 45 : 27th Dec'2020 

Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2
                  Credits -> 1  */

import java.util.LinkedHashMap;
import java.util.Set;

public class WordFrequencyUsingMap {
	void processData(String str) {
		String[] input = str.split(" ");
		LinkedHashMap<String, Integer> linkedhashmap = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < input.length; i++) {
			String word = input[i];
			if (linkedhashmap.containsKey(word)) {
				linkedhashmap.put(word, linkedhashmap.get(word) + 1);
			} else {
				linkedhashmap.put(word, 1);
			}
		}
		Set<String> keyset = linkedhashmap.keySet();
		System.out.println("Word frequency less than or equal to 2 in string is :");
		for (String str1 : keyset) {
			if (linkedhashmap.get(str1) <= 2) {
				System.out.println(str1 + " --> " + linkedhashmap.get(str1));
			}
		}
	}

	public static void main(String[] args) {
		WordFrequencyUsingMap wordFrequencyUsingMap = new WordFrequencyUsingMap();
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		wordFrequencyUsingMap.processData(input);
	}

}
