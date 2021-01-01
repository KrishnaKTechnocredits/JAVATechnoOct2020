/*
Program 2:
Find frequency of each number from the Array
Integer arr[] = {23,12,45,67,23,12,67,33};

 */

package yogita;

import java.util.Arrays;
import java.util.HashMap;

public class FindFrequencyOfNumber {
	static HashMap<Integer, Integer> findFrequency(int[] array) {
		System.out.println("Array Is:" + Arrays.toString(array));
		HashMap<Integer, Integer> frequencyOfChar = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			if (frequencyOfChar.containsKey(num)) {
				int count = frequencyOfChar.get(num);
				frequencyOfChar.put(num, count + 1);
			} else {
				frequencyOfChar.put(num, 1);
			}
		}
		return frequencyOfChar;
	}

	public static void main(String[] args) {

		int[] input = { 23, 12, 45, 67, 23, 12, 67, 33 };
		HashMap<Integer, Integer> frequencyCount = FindFrequencyOfNumber.findFrequency(input);
		System.out.println("Frequency Count Is:\n" + frequencyCount);
	}
}