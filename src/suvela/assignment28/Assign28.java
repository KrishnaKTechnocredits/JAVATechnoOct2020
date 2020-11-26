/*find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60*/
package suvela.assignment28;

import java.util.Arrays;

public class Assign28 {
	void maxSumOfTriplet(int[] array) {
		System.out.println("Given Array " +Arrays.toString(array));
		int max = 0;
		int sum = 0;
		int index = 0;
		int cnt = 0;
		for (int i = 0; i < array.length && cnt < (array.length / 3); i = i + 3) {
			sum = array[i] + array[i + 1] + array[i + 2];
			if (max < sum) {
				max = sum;
				index = i;
			}
			cnt++;
		}
		System.out.print("Maximum sum of triplet :" + array[index] + "," + array[index + 1] + "," + array[index + 2]
				+ ":>" + max);

	}

	public static void main(String[] args) {
		int arr[] = { 10, 12, 8, 20, 18, 22, 15, 13, 17,200,400,900};
		Assign28 assign = new Assign28();
		assign.maxSumOfTriplet(arr);
	}

}
