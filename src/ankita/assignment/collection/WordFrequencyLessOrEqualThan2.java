/*
Assignment - 45 : 27th Dec'2020

Print all the words having frequency less than or equal to 2.
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Techno -> 2
Credits -> 1

*/
package ankita.assignment.collection;

import java.util.HashMap;
import java.util.Set;

public class WordFrequencyLessOrEqualThan2 {
	void getWordFrequencyLessOrEqualThan2(String str) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("Input: " + str);
		String[] str1 = str.split(" ");

		for (int i = 0; i < str1.length; i++) {
			if (map.containsKey(str1[i])) {
				map.put(str1[i], map.get(str1[i]) + 1);
			} else {
				map.put(str1[i], 1);
			}
		}
		System.out.println(map);
		Set<String> set = map.keySet();
		for (String i : set) {
			if (map.get(i) <= 2)
				System.out.println(i + "=>" + map.get(i));
		}
	}

	public static void main(String[] args) {
		new WordFrequencyLessOrEqualThan2().getWordFrequencyLessOrEqualThan2(
				"Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno");
	}
}