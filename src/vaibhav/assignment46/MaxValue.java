package vaibhav.assignment46;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*Print the words having maximum frequency. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output :  Hi ->7*/ 


public class MaxValue {

	private static void printMax(String input) {
		HashMap <String,Integer> hp = new HashMap <String,Integer>();
		int maxValue = 0;
		String maxKey = null;
		String [] arr = input.split(" ");
		for (int i = 0 ; i < arr.length;i++) {
			if(!hp.containsKey(arr[i]))
				hp.put(arr[i], 1);
			else
				hp.put(arr[i], hp.get(arr[i])+1);			
		}
		
		Set<Entry<String,Integer>> st = hp.entrySet();
		for(Map.Entry<String,Integer> keyValue : st) {
			if (keyValue.getValue() > maxValue) {
				maxValue = keyValue.getValue();
				maxKey = keyValue.getKey();
			}
		}	
		System.out.println(maxKey+"-->"+maxValue);
	}

	public static void main(String[] args) {
		
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		MaxValue.printMax(input);
	}

}
