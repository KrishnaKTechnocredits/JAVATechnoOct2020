package mrunal;
/*
Program 2:
Find frequency of each number from the Array
Integer arr[] = {23,12,45,67,23,12,67,33};
*/
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class frequencyOfInteger {

	void getFrequencyOfInteger(int[] input) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		int count = 1;
		for (int index = 0; index < input.length; index++) {
			if (map.containsKey(input[index])) {
				map.put(input[index], count + 1);
			} else {
				map.put(input[index], count);
			}
		}
		Set<Entry<Integer, Integer>> output = map.entrySet();
		for (Entry<Integer, Integer> value : output) {
			System.out.println("Fequency of "+value.getKey() + " :" + value.getValue());
		}
	}

	public static void main(String[] args) {
		frequencyOfInteger object = new frequencyOfInteger();
		int arr[] = { 23, 12, 45, 67, 23, 12, 67, 33 };
		object.getFrequencyOfInteger(arr);
	}

}
