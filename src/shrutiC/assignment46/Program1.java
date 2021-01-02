package shrutiC.assignment46;

import java.util.LinkedHashMap;
import java.util.Set;

/*Print the words having maximum frequency. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output :  Hi ->7
*/

public class Program1 {

	void findWordFreq(String string) {

		String[] array = string.split(" ");
		int maxCount = 0;
		System.out.println("Input : " + string);
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		int count = 0;
		for (String inputStr : array) {
			if (map.containsKey(inputStr)) {
				count = map.get(inputStr) + 1;
				map.put(inputStr, count);
			} else {
				map.put(inputStr, 1);
			}
		}

		Set<String> set = map.keySet();
		String keyMax = "";
		for (String key : set) {
			if (map.get(key) > maxCount) {
				keyMax = key;
				maxCount = map.get(key);
			}
		}
		System.out.println(keyMax + " : " + maxCount);
	}

	public static void main(String[] args) {

		String string = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		Program1 obj = new Program1();
		obj.findWordFreq(string);
	}

}
