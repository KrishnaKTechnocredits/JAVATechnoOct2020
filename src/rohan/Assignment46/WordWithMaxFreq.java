package rohan.Assignment46;

import java.util.HashMap;
import java.util.Set;

/*
 * Print the words having maximum frequency. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output :  Hi ->7
 *
 */

public class WordWithMaxFreq {

	static void wordWithMaxFreq(String str) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		String[] strArr = str.split(" ");
		
		for(String word : strArr) {
			if(hm.containsKey(word))
				hm.put(word, hm.get(word)+1);
			else
				hm.put(word, 1);
		}
		
		Set<String> keySet = hm.keySet();
		int max=0;
		String maxKey="";
		for(String key : keySet) {
			if(hm.get(key) > max) {
				max = hm.get(key);
				maxKey = key;
			}
		}
		System.out.println(maxKey+" : "+hm.get(maxKey));
	}
	
	public static void main(String[] args) {
		wordWithMaxFreq("Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno");
	}
	
}
