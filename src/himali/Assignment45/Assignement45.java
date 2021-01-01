/*Assignment - 45 : 27th Dec'2020 

Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2
                  Credits -> 1  */

package himali.Assignment45;

import java.util.HashMap;
import java.util.HashSet;

public class Assignement45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		HashSet<String> set = new HashSet<String>();
		String maxKey = null;
		int maxValue = 0;

		String[] array = input.split(" ");
		int count = 0;
		for (String str : array) {

			if (map.containsKey(str)) {
				count = map.get(str);
				count++;

			} else {
				count = 1;

			}
			map.put(str, count);

			if (count <= 2) {
				set.add(str);
			} else {
				set.remove(str);
			}
		}

		for (String str : set) {
			System.out.println(str + "-->" + map.get(str));
		}

	}
}