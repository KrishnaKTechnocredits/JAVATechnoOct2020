package milind;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaxFrequencyWord {
	
	void wordHavingMaxFrequency(String input){
		
		String[] splitInput = input.split(" ");
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		for(int index = 0; index < splitInput.length; index ++) {
			if(hashMap.containsKey(splitInput[index])) {
				int count = hashMap.get(splitInput[index]);
				hashMap.put(splitInput[index],count + 1);
			}else {
				hashMap.put(splitInput[index], 1);
			}
		}
		
		int maxNumber = 0;
		String maxFrequencyWord = "";
		for(Entry<String, Integer> entry : hashMap.entrySet()) {
			if(maxNumber < entry.getValue()) {
				maxFrequencyWord = entry.getKey();
				maxNumber = entry.getValue();
			}
		}
		System.out.println(maxFrequencyWord + " : "  + maxNumber);
	}
	
	public static void main(String[] args) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		MaxFrequencyWord maxFrequencyWord = new MaxFrequencyWord();
		maxFrequencyWord.wordHavingMaxFrequency(input);
	} 
}
