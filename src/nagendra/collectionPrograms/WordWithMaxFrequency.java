package nagendra.collectionPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
Assignment - 46 : 27th Dec'2020 
Print the words having maximum frequency. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output :  Hi ->7 
*/

public class WordWithMaxFrequency {

	void getWordWithMaximumFrequency(String input) {
		int max=0;
		String maxFrequencyWord="";

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
			if (user.getValue()>max) {
				max=user.getValue();
				maxFrequencyWord=user.getKey();
			}
		}
		System.out.println(maxFrequencyWord +"->"+max);
		}


	public static void main(String[] args) {
		WordWithMaxFrequency frequency = new WordWithMaxFrequency();
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		frequency.getWordWithMaximumFrequency(input);
	}

	}
