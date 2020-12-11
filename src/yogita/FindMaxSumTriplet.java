/*
 * find the triplet having maximum sum.
 
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60

*/
package yogita;

import java.util.Arrays;

public class FindMaxSumTriplet {
	void maxSumTriplet(int[] input) {
		System.out.println("Array is:" + Arrays.toString(input));
		int maxIndex = 0;
		int max = 0;
		for (int i = 0; i < input.length; i += 3) {
			int sum = input[i] + input[i + 1] + input[i + 2];
			if (sum > max) {
				max = sum;
				maxIndex = i;
			}
		}
		System.out.println(
				"Max Sum Triplet is:" + input[maxIndex] + "," + input[maxIndex + 1] + "," + input[maxIndex + 2]);
		System.out.println("Sum of triplet is:" + max);
	}

	public static void main(String[] args) {
		FindMaxSumTriplet tripletSum = new FindMaxSumTriplet();
		int[] array = { 10, 20, 40, 88, 59, 66, 74, 20, 30 };
		tripletSum.maxSumTriplet(array);
	}
}
