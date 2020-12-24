package shrutiC.assignment44;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*Program 1:
	Find frequency of each word from the String
	String str1 = "hello gm hi gm hello pune gn";
*/

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
		System.out.println("Frequency of words : " + map);
	}

	public static void main(String[] args) {

		String string = "hello gm hi gm hello pune gn";
		Program1 obj = new Program1();
		obj.findWordFreq(string);
	}

}
