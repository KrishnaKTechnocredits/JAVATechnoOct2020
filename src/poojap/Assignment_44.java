/*Program 1:
Find frequency of each word from the String
String str1 = "hello gm hi gm hello pune gn";
*/
package poojap;

import java.util.HashMap;
import java.util.Set;

public class Assignment_44 {
	static void wordFrequency(String str) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] arr = str.split(" ");

		for (String word : arr) {
			if (hm.containsKey(word)) {
				hm.put(word, hm.get(word) + 1);
			} else {
				hm.put(word, 1);
			}
		}
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			System.out.println(key + ":" + hm.get(key));
		}
	}

	public static void main(String[] args) {
		wordFrequency("hello gm hi gm hello pune gn");
	}
}
