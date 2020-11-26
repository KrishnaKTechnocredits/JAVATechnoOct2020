package sadhana;

import java.util.Arrays;
/*Assignment - 28 : 25th Nov'2020
find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60*/

public class MaxSumOfArrayTriplet {

	void printData(int[] arr) {
		int result = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i += 3) {
			int maxSum = arr[i] + arr[i + 1] + arr[i + 2];
			if (maxSum > result) {
				result = maxSum;
				index = i;
			}
		}
		System.out.println(
				"Maximum sum triplet " + arr[index] + "," + arr[index + 1] + "," + arr[index + 2] + " --> " + result);
	}

	public static void main(String[] arg) {
		MaxSumOfArrayTriplet maxSumOfArrayTriplet = new MaxSumOfArrayTriplet();
		int[] inputArray = new int[] { 10, 12, 8, 20, 18, 22, 15, 13, 17 };
		System.out.println("Array elements :");
		System.out.println(Arrays.toString(inputArray));
		maxSumOfArrayTriplet.printData(inputArray);
	}
}