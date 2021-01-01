/*Program 2:
Find frequency of each number from the Array
Integer arr[] = {23,12,45,67,23,12,67,33};*/

package poojap;

import java.util.HashMap;
import java.util.Set;

public class FrequencyOfNumber {

	static void FrequeOfNumber(int arr[]) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (hm.containsKey(num)) {
				int temp = hm.get(num);
				hm.put(num, temp + 1);
			} else {
				hm.put(num, 1);
			}
		}
		Set<Integer> keySet = hm.keySet();
		for (Integer key : keySet) {
			System.out.println(key + ":" + hm.get(key));
		}
	}

	public static void main(String[] args) {
		int arr[] = { 23, 12, 45, 67, 23, 12, 67, 33 };
		FrequeOfNumber(arr);
	}
}
