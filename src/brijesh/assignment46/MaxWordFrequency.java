package brijesh.assignment46;

import java.util.LinkedHashMap;
import java.util.Set;

/*
Print the words having maximum frequency. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output :  Hi ->7 
*/

public class MaxWordFrequency {

	void findMaxWordFrequency(String input) {
		String[] splitted = input.split(" ");
		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
		for (String key : splitted) {
			if (hashMap.containsKey(key))
				hashMap.put(key, hashMap.get(key) + 1);
			else
				hashMap.put(key, 1);
		}
		Set<String> set = hashMap.keySet();
		int max = 0; 
		String maxKey=null;
		for (String key : set) {
			if (hashMap.get(key) > max) {
				max = hashMap.get(key);
				maxKey=key;
			}
		}
		System.out.println(maxKey +" -> "+ max);
	}

	public static void main(String[] args) {
		new MaxWordFrequency().findMaxWordFrequency("Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno");
	}
}
