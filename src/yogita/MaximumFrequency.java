
/*Assignment - 46 : 27th Dec'2020 
Print the words having maximum frequency. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output :  Hi ->7 
*/

package yogita;

import java.util.LinkedHashMap;
import java.util.Set;

public class MaximumFrequency {
	void findFrequencyOfWord(String str) {
		System.out.println("String is:" + str);
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
		String maxFreqencyString = "";
		for (String string : keyset) {
			if (map.get(string) > max) {
				max = map.get(string);
				maxFreqencyString = string;
			}
		}
		System.out.println("\nMaximum Frequency Word is\n" + maxFreqencyString + "\nFrequency is-->" + max);
	}

	public static void main(String[] args) {
		MaximumFrequency frequencyOfWord = new MaximumFrequency();
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		frequencyOfWord.findFrequencyOfWord(input);
	}
}
