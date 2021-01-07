/*
Find frequency of each word from the String
String str1 = "hello gm hi gm hello pune gn";
*/

package vishakha.Asgnmt_44;

import java.util.HashMap;
import java.util.Map;

public class WordFreqUsingMap {

	public void findFreqOfWords(String string) {
		System.out.println("Given String: "+string);
		String[] splitted = string.split(" ");
		Map<String,Integer> map = new HashMap<>();
		for(String key : splitted) {
			if(map.containsKey(key))
				map.put(key, map.get(key)+1);
			else
				map.put(key, 1);
		}
		System.out.println("Frequency of words:\n"+map);
	}
	
	public static void main(String[] args) {
		new WordFreqUsingMap().findFreqOfWords("hello gm hi gm hello pune gn");
	}
}
