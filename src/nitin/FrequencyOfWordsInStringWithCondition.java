package nitin;

import java.util.LinkedHashMap;
import java.util.Set;

/* Assignment - 45 : 27th Dec'2020 - Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2
          Credits -> 1 */
public class FrequencyOfWordsInStringWithCondition {
	public void getFrequencyOfWordsInStringWithCondition(String str) {
		System.out.println("Input String - > "+str);
		String[] word = str.split(" ");
		LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
		for(String key : word) {
			if(map.containsKey(key))
				map.put(key, map.get(key)+1);
			else
				map.put(key, 1);
		}
		Set<String> set = map.keySet();
		for(String key : set) {
			if(map.get(key) <=2)
				System.out.println(key+" : "+map.get(key));
		}
	}
	public static void main(String[] args) {
		new FrequencyOfWordsInStringWithCondition().getFrequencyOfWordsInStringWithCondition("Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno");
	}
}
