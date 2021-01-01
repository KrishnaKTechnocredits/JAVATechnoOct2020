package ritika.Assignments;

import java.util.LinkedHashMap;
import java.util.Set;

/*Assignment - 45 : 27th Dec'2020

Print all the words having frequency less than or equal to 2.
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Techno -> 2
Credits -> 1
*/
public class Asgmt_45 {

	static void printWordsHavingFreqLessThan3(String input) {
		String[] inputArr = input.split(" ");
		System.out.println("Words from given String having frequency less than 3 are: ");
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
		for (String string: keySet) {
			if(mapStr.get(string) <= 2)
				System.out.println(string + " -> " + mapStr.get(string));
		}
	}
	
	public static void main(String[] args) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		printWordsHavingFreqLessThan3(input);
	}
}
