/*Assignment - 29 : 26th Nov'2020 
Find second maximum from array without sorting the array.
*/

package ankita.assignment.array;

import java.util.Arrays;

public class SecondMaxNumber {

	void findSecondMaxNumber(int[] arr) {
		int maxFirst = 0;
		int maxSecond = 0;

		if (arr[0] > arr[1]) {
			maxFirst = arr[0];
			maxSecond = arr[1];
		} else {
			maxFirst = arr[1];
			maxSecond = arr[0];
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > maxFirst) {
				maxSecond = maxFirst;
				maxFirst = arr[i];

			} else if (arr[i] > maxSecond) {
				maxSecond = arr[i];
			}
		}
		System.out.println("Input :"+ Arrays.toString(arr));
		System.out.println("Second Maximum number: " + maxSecond);
	}

	public static void main(String[] args) {
		int arr[] = { 5, 12, 10, 54, 89, 81, 20, 93 };
		new SecondMaxNumber().findSecondMaxNumber(arr);
	}
}
