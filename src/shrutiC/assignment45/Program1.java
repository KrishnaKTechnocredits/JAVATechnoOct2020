package shrutiC.assignment45;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/*Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno"; 
output :  Techno -> 2
		Credits -> 1*/

public class Program1 {

	void findWordFreq(String string) {

		String[] array = string.split(" ");
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
		for(String key:set)
		{
			if(map.get(key)<=2)
				System.out.println(key + " : " + map.get(key));
		}
	}

	public static void main(String[] args) {

		String string = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		Program1 obj = new Program1();
		obj.findWordFreq(string);
	}

}
