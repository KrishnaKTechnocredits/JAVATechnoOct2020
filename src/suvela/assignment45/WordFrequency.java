/*Assignment - 45 : 27th Dec'2020 

Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2
                  Credits -> 1 */
package suvela.assignment45;

import java.util.HashMap;
import java.util.Set;

public class WordFrequency {
	public void findFreq(HashMap<String, Integer> map) {

		String str = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		String[] array = str.split(" ");
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
		for (String word : set) {
			int num=map.get(word);
			if(num<=2)
				System.out.println(word+ "->" +num);
		}
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println("Frequency of the words is:-");
		new WordFrequency().findFreq(map);
		

	}

}
