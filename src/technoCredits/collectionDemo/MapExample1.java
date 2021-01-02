package technoCredits.collectionDemo;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapExample1 {
    // Hi Hello Hi Hi Globant Hi Hello Hello Globant Hi
	static void wordFreq(String str) {
		TreeMap<String, Integer> hm = new TreeMap<String, Integer>();
		String[] arr = str.split(" ");
		
		for(String word : arr) {
			if(hm.containsKey(word)) {
				hm.put(word, hm.get(word) + 1);
			}else {
				hm.put(word, 1);
			}		
		}
		
		Set<String> keySet = hm.keySet();
		for(String key : keySet) {
			int value = hm.get(key);
			System.out.println(key + ":" + hm.get(key));
		}
			
	}
	
	
	public static void main(String[] args) {
		wordFreq("Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi");
	}
}
