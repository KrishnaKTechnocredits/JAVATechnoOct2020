/*
Assignment 44 :
Program 2:
Find frequency of each number from the Array
Integer arr[] = {23,12,45,67,23,12,67,33};
*/
package ankita.assignment.collection;

import java.util.Arrays;
import java.util.HashMap;

public class NumberFrequency {

	void getNumberFrequency(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println("Input :" + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		int arr[] = { 23, 12, 45, 67, 23, 12, 67, 33 };
		new NumberFrequency().getNumberFrequency(arr);
	}
}
