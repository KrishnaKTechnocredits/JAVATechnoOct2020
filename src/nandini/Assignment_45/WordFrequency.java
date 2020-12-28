package nandini.Assignment_45;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
	
	public static void main(String args[]) {
		HashMap<String,Integer> map = new HashMap<>();
		int cnt = 0;
		String str = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		String [] strArray = str.split(" ");
		for(int index = 0; index < strArray.length;index++) {
			String word = strArray[index];
			if(map.containsKey(word)) {
				 cnt = map.get(word)+1;
				map.put(word, cnt);
			}
			else {
				map.put(word, 1);
			}
		}
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			if(m.getValue()<=2) {
				System.out.println("key: "+m.getKey() + " & Value: " + m.getValue());
			}
		}
	}

}
