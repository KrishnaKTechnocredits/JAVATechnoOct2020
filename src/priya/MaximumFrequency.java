//Assignment - 46 : 27th Dec'2020 : Print the words having maximum frequency. 
//String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
//output :  Hi ->7

package priya;

import java.util.LinkedHashMap;
import java.util.Set;

public class MaximumFrequency {

	static void maximumFrequency(String string) {
		String[] input = string.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		Set<String> keyset = map.keySet();
		int max = 0;
		String maxFreqString = "";
		for (String string1 : keyset) {
			if (map.get(string1) > max) {
				max = map.get(string1);
				maxFreqString = string1;
			}
		}
		System.out.println("Words having maximum frequency : " + maxFreqString + " " + max);
	}

	public static void main(String[] args) {
		String string = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		maximumFrequency(string);
	}
}
