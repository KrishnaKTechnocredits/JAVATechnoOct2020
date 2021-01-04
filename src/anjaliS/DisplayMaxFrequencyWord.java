package anjaliS;

import java.util.LinkedHashMap;
import java.util.Set;

public class DisplayMaxFrequencyWord {
	void findMaxFrequencyWord(String str) {
		String[] input = str.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < input.length; i++) {
			String str1 = input[i];
			if (map.containsKey(str1)) {
				map.put(str1, map.get(str1) + 1);
			} else {
				map.put(str1, 1);
			}

		}
		Set<String> keyset = map.keySet();
		int max = 0;
		String maxFreqString = " ";
		for (String str2 : keyset) {
			if (map.get(str2) > max) {
				max = map.get(str2);
				maxFreqString = str2;
			}
		}
		System.out.println("Maximum frequency is "+max+ " Of string "+maxFreqString);
	}
 
	public static void main(String[] args) {
		DisplayMaxFrequencyWord DisplayMaxFrequencyWord = new DisplayMaxFrequencyWord();
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		DisplayMaxFrequencyWord.findMaxFrequencyWord(input);
	}

}
