package priyanka.Assignment45;

import java.util.LinkedHashMap;
import java.util.Set;

/*
Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2
          Credits -> 1 
*/

public class FrequencyOfWords {

	void frequencyOfWordsLessThanTwo(String input) {
		String[] splitted = input.split(" ");
		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
		for (String key : splitted) {
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
		new FrequencyOfWords().frequencyOfWordsLessThanTwo(
				"Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno");
	}

}
