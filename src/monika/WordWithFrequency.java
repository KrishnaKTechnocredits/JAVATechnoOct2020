package monika;
/*
 
Assignment - 45 :
Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2
                  Credits -> 1 
*/

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;



public class WordWithFrequency {

	void getDisplayFrequency(String input) {
		String[] word = input.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < word.length; i++) {
			if (map.containsKey(word[i])) {
				map.put(word[i], map.get(word[i]) + 1);
			} else {
				map.put(word[i], 1);
			}
		}
		Set<Entry<String, Integer>> output = map.entrySet();

		for (Entry<String, Integer> user : output) {
			if (user.getValue() <= 2) {
				System.out.println(user.getKey() + " ->" + user.getValue());
			}
		}
	}

	public static void main(String[] args) {
		WordWithFrequency frequency = new WordWithFrequency();
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		frequency.getDisplayFrequency(input);
	}
}