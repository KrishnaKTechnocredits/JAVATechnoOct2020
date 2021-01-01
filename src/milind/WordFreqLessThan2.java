package milind;

import java.util.HashMap;
import java.util.Map.Entry;

public class WordFreqLessThan2 {
	
	HashMap<String, Integer> wordFreq(String input) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		String[] arrayInput = input.split(" ");
		for(int index = 0; index < arrayInput.length; index++) {
			String wordFromString = arrayInput[index]; 
			if(hashMap.containsKey(wordFromString)) {
				int count = hashMap.get(wordFromString);
				hashMap.put(wordFromString, count + 1);
			}else {
				hashMap.put(wordFromString, 1);
			}
		}
		return hashMap;
	}
	
	void lessThan2WordFreq(HashMap<String, Integer> map){
		for( Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() <= 2) {
				System.out.println(entry.getKey() + " -> " + entry.getValue());
			}
		}
	}
	
	public static void main(String[] args) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		WordFreqLessThan2 wordFreqLessThan2 = new WordFreqLessThan2();
		HashMap<String, Integer> hashMap = wordFreqLessThan2.wordFreq(input);
		wordFreqLessThan2.lessThan2WordFreq(hashMap);
	}

}
