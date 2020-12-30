/*Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2
          Credits -> 1 */

package poojap;

import java.util.LinkedHashMap;
import java.util.Set;

public class Assignment_45 {
	static void frequencyOfWord(String str) {
		String[] input = str.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < input.length; i++) {
			String string = input[i];
			if (map.containsKey(string)) {
				map.put(string, map.get(string) + 1);
			} else {
				map.put(string, 1);
			}
		}
		Set<String> keyset = map.keySet();
		System.out.println("Words Having Frequency Less Than or Equal to Two");
		for (String string : keyset) {
			if (map.get(string) <= 2) {
				System.out.println(string + " : " + map.get(string));
			}
		}
	}

	public static void main(String[] args) {
		String str = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		frequencyOfWord(str);
	}
}
