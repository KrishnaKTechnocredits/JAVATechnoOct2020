package prasad.collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/*Assignment - 46 : 27th Dec'2020

Print the words having maximum frequency.
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output : Hi ->7*/

public class PrintMaxFreqWord {
	static LinkedHashMap<String, Integer> getWordCount(String[] arry) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (int index = 0; index < arry.length; index++) {
			String word = arry[index];
			if (map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, count + 1);
			} else {
				map.put(word, 1);
			}
		}
		return map;
	}
	
	static void printMaxFreq(LinkedHashMap<String,Integer>map) {
		System.out.println("Printing word with MAX frequency:-");
		int maxFreq=0;
		String word=" ";
		for(Entry<String,Integer>entry : map.entrySet() ) {
			if(entry.getValue()>maxFreq) {
				maxFreq=entry.getValue();
				word = entry.getKey();
			}
		}
		System.out.println(word + " -> " +maxFreq);
}
	public static void main (String[]arg) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		String[] words = input.split(" ");
		LinkedHashMap<String, Integer> output = PrintMaxFreqWord.getWordCount(words);
		printMaxFreq(output);
	}
}
