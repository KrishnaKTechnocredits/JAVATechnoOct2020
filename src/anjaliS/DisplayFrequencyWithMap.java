package anjaliS;

import java.util.LinkedHashMap;
import java.util.Set;

public class DisplayFrequencyWithMap {
	void findFrequencyOfString(String str) {
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
		System.out.println("Frequency less than or equal to 2 is");
		for (String str1 : keyset) {
			if (linkedhashmap.get(str1) <= 2) {
				System.out.println(str1 + " : " + linkedhashmap.get(str1));
			}
		}
	}

	public static void main(String[] args) {
		DisplayFrequencyWithMap map = new DisplayFrequencyWithMap();
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		map.findFrequencyOfString(input);
	}

}
