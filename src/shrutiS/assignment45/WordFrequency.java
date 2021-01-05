/*Assignment - 45 

Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2
          Credits -> 1 */
package shrutiS.assignment45;

import java.util.LinkedHashMap;
import java.util.Set;

public class WordFrequency {

	void frequencyOfWordsLessThanTwo(String input) {
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
		for (String key : set) {
			if (hashMap.get(key) <= 2)
				System.out.println(key + " -> " + hashMap.get(key));
		}
	}

	public static void main(String[] args) {
		new WordFrequency().frequencyOfWordsLessThanTwo("Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno");
	}
}
