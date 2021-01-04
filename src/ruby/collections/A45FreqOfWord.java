package ruby.collections;

import java.util.HashMap;
import java.util.Set;

/*Assignment - 45 : 27th Dec'2020

Print all the words having frequency less than or equal to 2.
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2   Credits -> 1 */

public class A45FreqOfWord {

	static void findWordFreq(String input) {

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
		for (String names : setOfWord) {
			if (hMap.get(names) <= 2) {
				System.out.println(names + " : " + hMap.get(names));
			}
		}
	}

	public static void main(String[] args) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		A45FreqOfWord.findWordFreq(input);
	}
}