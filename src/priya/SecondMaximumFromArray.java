//Assignment - 29 : 26th Nov'2020 
//Find second maximum from array without sorting the array.

package priya;

import java.util.Arrays;

public class SecondMaximumFromArray {

	void secondMaxNumber(int arr[]) {
		int max = arr[0];
		int secondMax = arr[1];
		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = 2; innerIndex < arr.length; innerIndex++) {
				if (arr[innerIndex] > max) {
					secondMax = max;
					max = arr[innerIndex];
				} else if (arr[innerIndex] > secondMax)
					secondMax = arr[innerIndex];
			}
		}
		System.out.println("The second maximum number is " + secondMax);
	}

	public static void main(String[] arg) {
		SecondMaximumFromArray secondMaximumFromArray = new SecondMaximumFromArray();
		int arr[] = { 10, 40, 90, 5, 150, 220, 100, 70 };
		System.out.println("The Given array is :" + Arrays.toString(arr));
		secondMaximumFromArray.secondMaxNumber(arr);
	}
}
