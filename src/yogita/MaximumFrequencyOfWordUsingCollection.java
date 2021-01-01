/*
 Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2
          Credits -> 1 
*/

package yogita;

import java.util.LinkedHashMap;
import java.util.Set;

public class MaximumFrequencyOfWordUsingCollection {
	 void findFrequencyOfWord(String str) {
		System.out.println("String is:" + str);
		String[] input = str.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < input.length; i++) {
			String str1 = input[i];
			if (map.containsKey(str1)) {
				map.put(str1, map.get(str1) + 1);
			} else {
				map.put(str1, 1);
			}
		}
		Set<String> keyset = map.keySet();
		System.out.println("Words Having Frequency Less Than or Equal to 2");
		for (String string : keyset) {
			if (map.get(string) <= 2) {
				System.out.println(string + " : " + map.get(string));
			}
		}
	}

	public static void main(String[] args) {
		MaximumFrequencyOfWordUsingCollection frequencyOfWord =new MaximumFrequencyOfWordUsingCollection();
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		frequencyOfWord.findFrequencyOfWord(input);
	}
}
