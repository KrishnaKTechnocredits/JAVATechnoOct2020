/*Assignment : 44 

Program 1:
Find frequency of each word from the String
String str1 = "hello gm hi gm hello pune gn";*/

package shrutiS.assignment44;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWord {
	
	public void findFrequencyOfWords(String string) {
		System.out.println("Given String: "+string);
		String[] temp = string.split(" ");
		Map<String,Integer> map = new HashMap<>();
		for(String key : temp) {
			if(map.containsKey(key))
				map.put(key, map.get(key)+1);
			else
				map.put(key, 1);
		}
		System.out.println("Frequency of words:\n"+map);
	}
	
	public static void main(String[] args) {
		new FrequencyOfWord().findFrequencyOfWords("hello gm hi gm hello pune gn");
	}
}
