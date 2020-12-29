/*Assignment - 46 : 27th Dec'2020

Print the words having maximum frequency.
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output : Hi ->7
*/
package ankita.assignment.collection;

import java.util.HashMap;
import java.util.Set;

public class WordWithMaximumFrequency {
	void maximumFrequency(HashMap<String, Integer> map) {
		int maxFreq = 0;
		String maxFreqStr = null;
		Set<String> set = map.keySet();
		for (String str : set) {
			if (map.get(str) > maxFreq) {
				maxFreq = map.get(str);
				maxFreqStr = str;
			}
		}
		System.out.println(maxFreqStr + "=> " + maxFreq);
	}

	void getWordWithMaximumFrequency(String str) {
		System.out.println("Input :" + str);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			if (map.containsKey(str1[i])) {
				map.put(str1[i], map.get(str1[i]) + 1);
			} else {
				map.put(str1[i], 1);
			}
		}
		System.out.println(map);
		maximumFrequency(map);
	}

	public static void main(String[] args) {
		new WordWithMaximumFrequency().getWordWithMaximumFrequency(
				"Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno");
	}
}