package rohan.Assignment45;

import java.util.HashMap;
import java.util.Set;

/*
Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2
          Credits -> 1 
 * 
 */

public class FreqOfWordLessThan2 {
	
	static void freqOfWordLessThan2(String str) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		String[] strArr = str.split(" ");
		
		for(String word : strArr) {
			if(hm.containsKey(word)) {
				hm.put(word,hm.get(word)+1);
			}else {
				hm.put(word, 1);
			}
		}
		
		Set<String> keySet = hm.keySet();
		for(String key : keySet) {
			if(hm.get(key) <= 2)
				System.out.println(key + " : "+hm.get(key));
		}
	}
	
	public static void main(String[] args) {
		freqOfWordLessThan2("Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno");
	}

}
