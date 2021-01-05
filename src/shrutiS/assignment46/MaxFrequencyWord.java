/*Assignment - 46 
Print the words having maximum frequency. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output :  Hi ->7 */

package shrutiS.assignment46;

import java.util.LinkedHashMap;
import java.util.Set;

public class MaxFrequencyWord {

	void findMaxWordFrequency(String input) {
		System.out.println("String input = "+input);
		String[] temp = input.split(" ");
		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
		for (String key : temp) {
			if (hashMap.containsKey(key))
				hashMap.put(key, hashMap.get(key) + 1);
			else
				hashMap.put(key, 1);
		}
		Set<String> set = hashMap.keySet();
		int max = 0;
		String maxKey = null;
		for (String key : set) {
			if (hashMap.get(key) > max) {
				max = hashMap.get(key);
				maxKey = key;
			}
		}
		System.out.println(maxKey + " -> " + max);
	}

	public static void main(String[] args) {
		new MaxFrequencyWord().findMaxWordFrequency(
				"Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno");
	}
}
