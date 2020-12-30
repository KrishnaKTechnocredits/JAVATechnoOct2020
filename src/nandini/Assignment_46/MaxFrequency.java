package nandini.Assignment_46;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {
	
	public static void main(String args[]) {
		HashMap<String,Integer> map = new HashMap<>();
		int cnt = 0, maxValue=0;
		String key = null;
		String str = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
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
			if(m.getValue()>=maxValue) {
				maxValue = m.getValue();
				key = m.getKey();
				System.out.println("key: "+key + " & Value: " + maxValue);
			}
		}
	}
}
