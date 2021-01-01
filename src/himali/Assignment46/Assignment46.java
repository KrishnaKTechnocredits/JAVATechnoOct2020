/*Assignment - 46 : 27th Dec'2020 

Print the words having maximum frequency. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output :  Hi ->7 */
package himali.Assignment46;

import java.util.HashMap;

public class Assignment46 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String maxKey = null;
		int maxValue = 0;

		String msg = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		String[] array = msg.split(" ");
		int count = 0;
		for (String str : array) {

			if (map.containsKey(str)) {
				count = map.get(str);
				count++;

			} else {
				count = 1;

			}
			map.put(str, count);

			if (count > maxValue) {
				maxKey = str;
				maxValue = count;
			}

		}
		System.out.println(maxKey+"-->"+maxValue);

	}

}
