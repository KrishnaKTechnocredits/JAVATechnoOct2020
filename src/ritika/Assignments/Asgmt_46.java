package ritika.Assignments;

import java.util.LinkedHashMap;
import java.util.Set;

/*Assignment - 46 : 27th Dec'2020

Print the words having maximum frequency.
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output : Hi ->7*/
public class Asgmt_46 {

	static void printWordHavingMaxFreq(String input) {
		String[] inputArr = input.split(" ");
		System.out.println("Word from given String having maximum frequency is: ");
		LinkedHashMap<String, Integer> mapStr = new LinkedHashMap<String, Integer>();
		
		for (int index=0; index<inputArr.length; index++) {
			String str = inputArr[index];
			if(mapStr.containsKey(str)) {
				Integer cnt = mapStr.get(str)+1;
				mapStr.put(str, cnt);
			}
			else {
				mapStr.put(str,1);
			}
		}
		Set<String> keySet = mapStr.keySet();
		int maxFreq=0;
		String maxFreqWord = null;
		for (String string: keySet) {
			if(mapStr.get(string) > maxFreq) {
				maxFreq = mapStr.get(string);
				maxFreqWord = string;
			}
		}
		System.out.println(maxFreqWord + " -> " + maxFreq + " times");
	}
	
	public static void main(String[] args) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		printWordHavingMaxFreq(input);
	}
}
