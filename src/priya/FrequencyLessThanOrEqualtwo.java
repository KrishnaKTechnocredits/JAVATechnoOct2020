//Assignment - 45 : 27th Dec'2020 : Print all the words having frequency less than or equal to 2. 
//String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
//output :  Techno -> 2                  Credits -> 1 

package priya;

import java.util.HashMap;
import java.util.Set;

public class FrequencyLessThanOrEqualtwo {

	static void CalculateWordFreq(String input) {

		String[] word = input.split(" ");
		HashMap<String, Integer> hMap = new HashMap<>();
		for (int i = 0; i < word.length; i++) {
			if (hMap.containsKey(word[i])) {
				hMap.put(word[i], hMap.get(word[i]) + 1);
			} else {
				hMap.put(word[i], 1);
			}
		}
		Set<String> setOfWord = hMap.keySet();
		for (String names : setOfWord) {
			if (hMap.get(names) <= 2) {
				System.out.println(names + " : " + hMap.get(names));
			}
		}
	}

	public static void main(String[] args) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		FrequencyLessThanOrEqualtwo.CalculateWordFreq(input);
	}
}
