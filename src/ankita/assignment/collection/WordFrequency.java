/*Assignment : 44 [24th Dec'2020]

Program 1:
Find frequency of each word from the String
String str1 = "hello gm hi gm hello pune gn";
*/
package ankita.assignment.collection;

import java.util.HashMap;

public class WordFrequency {
	void getWordFrequency(String str) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("Input : " + str);
		String[] str1 = str.split(" ");

		for (int i = 0; i < str1.length; i++) {
			if (map.containsKey(str1[i])) {
				map.put(str1[i], map.get(str1[i]) + 1);
			} else {
				map.put(str1[i], 1);
			}
		}
		System.out.println("Freq of each word  : " + map);
	}

	public static void main(String[] args) {
		new WordFrequency().getWordFrequency("hello gm hi gm hello pune gn");
	}
}
