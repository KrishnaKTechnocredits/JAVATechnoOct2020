package shrutiC.assignment44;

import java.util.Arrays;
import java.util.LinkedHashMap;

/*Program 2:
	Find frequency of each number from the Array
	Integer arr[] = {23,12,45,67,23,12,67,33};
*/

public class Program2 {

	void findNumFreq(int[] array) {

		System.out.println("Input : " + Arrays.toString(array));
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		int count = 0;
		for (int num : array) {
			if (map.containsKey(num)) {
				count = map.get(num) + 1;
				map.put(num, count);
			} else {
				map.put(num, 1);
			}
		}
		System.out.println("Frequency of numbers : " + map);
	}

	public static void main(String[] args) {

		int numArray[] = { 23, 12, 45, 67, 23, 12, 67, 33 };
		Program2 obj = new Program2();
		obj.findNumFreq(numArray);
	}

}
