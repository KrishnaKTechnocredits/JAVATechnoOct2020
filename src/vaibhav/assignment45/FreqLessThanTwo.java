package vaibhav.assignment45;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*Assignment - 45 : 27th Dec'2020 

Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2
         Credits -> 1 */


public class FreqLessThanTwo {

	static void displayFrequency(String str1) {
		LinkedHashMap <String,Integer> hp = new LinkedHashMap <String,Integer> ();
		String [] splittedArray = str1.split(" ");
		for (int i = 0 ; i < splittedArray.length;i++) {
			if(!hp.containsKey(splittedArray[i]))
				hp.put(splittedArray[i], 1);
			else
				hp.put(splittedArray[i], hp.get(splittedArray[i])+1);			
		}
		Set<Entry<String, Integer>> st= hp.entrySet();		
		for (Map.Entry<String,Integer> keyValue : st ) {
			if(keyValue.getValue() <=2) {
				System.out.println(keyValue.getKey()+ "=" + keyValue.getValue());				
			}			
		}		
	}

	public static void main(String[] args) {		
		String str1 = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		FreqLessThanTwo.displayFrequency(str1);		
	}
	
}
