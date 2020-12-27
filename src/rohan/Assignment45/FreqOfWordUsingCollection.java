package rohan.Assignment45;

import java.util.HashMap;
import java.util.Set;

/*
 * Program to find frequency of words using Collection
 * #HashMap
 * String - Hi Hello Hi Hi Globant Hi Hello Hello Globant Hi
 */

public class FreqOfWordUsingCollection { 
	
	void freqOfWord(String str) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		String[] strArr = str.split(" ");
		
		for(String word : strArr) {
			if(hm.containsKey(word)) {
				hm.put(word, hm.get(word)+1);
			}else {
				hm.put(word, 1);
			}
		}
		//System.out.println(hm);
		Set<String> keySet = hm.keySet();
		for(String key : keySet) {
			System.out.println(key+ " : "+hm.get(key));
		}
	}
	
	public static void main(String[] args) {
		FreqOfWordUsingCollection fq = new FreqOfWordUsingCollection();
		fq.freqOfWord("Hi Hello hey Hi Hi Globant Hi Hello Hello Globant Hi");	
	}
}
