package deepak.assignment46;

import java.util.HashMap;
import java.util.Set;

/*Assignment - 46 : 27th Dec'2020
Print the words having maximum frequency.
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output :  Hi ->7 */

public class MaxFreqWord {

	static void findMaxFreqWord(String input) {
		int count = 0;
		String[] word = input.split(" ");
		HashMap<String, Integer> hMap = new HashMap<>();
		for (int index = 0; index < word.length; index++) {
			if (hMap.containsKey(word[index])) {
				hMap.put(word[index], hMap.get(word[index]) + 1);
			} else {
				hMap.put(word[index], 1);
			}
		}
		Set<String> setOfWord = hMap.keySet();
		String temp = "";
		for (String name : setOfWord) {
			if (count < hMap.get(name)) {
				count = hMap.get(name);
				temp = name;
			}
		}
		System.out.println(temp + " -> " + count);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits globant globant globant globant Techno";
		MaxFreqWord.findMaxFreqWord(input);
	}

}