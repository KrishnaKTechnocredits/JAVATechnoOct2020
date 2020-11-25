/*find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60*/
package poojap;

import java.util.Arrays;
public class TripletSum {
	void MaxTripletSum(int[] arr) {
		int maxSum = 0;
		int maxIndex = 0;
		for (int index = 0; index < arr.length; index += 3) {
			int sum = arr[index] + arr[index + 1] + arr[index + 2];
			// System.out.print(sum);
			if (sum > maxSum) {
				maxSum = sum;
				maxIndex = index;
			}
		}
		System.out.println("Maximum Sum Triplet is : " + arr[maxIndex] + "," + arr[maxIndex + 1] + ","
				+ arr[maxIndex + 2] + " Sum Is : " + maxSum);

	}

	public static void main(String[] args) {
		TripletSum tripletSum = new TripletSum();
		int[] input = { 10, 12, 8, 20, 18, 22, 15, 13, 17 };
		tripletSum.MaxTripletSum(input);
	}
}
