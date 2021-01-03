/*Assignment - 46 : 27th Dec'2020 

Print the words having maximum frequency. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output :  Hi ->7 */
package suvela.assignment46;

import java.util.HashMap;
import java.util.Set;

public class WordWithMaxFreq {
	public void findFreq(HashMap<String, Integer> map) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		String[] array = input.split(" ");
		for (int i = 0; i < array.length; i++) {
			String word = array[i];
			if (map.containsKey(word)) {
				Integer cnt = map.get(word) + 1;
				map.put(word, cnt);
			} else {
				map.put(word, 1);
			}
		}
		Set<String> set = map.keySet();
		int max = 0;
		String s1 = null;
		for (String name : set) {
			int temp = map.get(name);
			if (temp > max) {
				max = temp;
				s1 = name;
			}
		}
		System.out.println("Word with maximum frequency is " +s1+":"+max);
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		new WordWithMaxFreq().findFreq(map);
	}

}
