/*Assignment - 28 : 25th Nov'2020 

find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60


*/
package ankita.assignment.array;

import java.util.Arrays;

public class TripletWithMaxSum {

	void getTripletWithMaxSum(int[] arr) {
		int sum = 0;
		int max = 0;
		int maxIndex = 0;
		System.out.println("Input Array : " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i = i + 3) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					sum = arr[i] + arr[j] + arr[k];
					/*
					 * System.out.println("1:" +arr[i] + " 2:"+arr[j]+" 3:"+arr[k]);
					 * System.out.println("sum :"+ sum);
					 */ break;
				}
				break;
			}
			if (max < sum) {
				max = sum;
				sum = 0;
				maxIndex = i;
			}
		}
		System.out.println(
				"Triplet with maximum Sum :" + arr[maxIndex] + " " + arr[maxIndex + 1] + " " + arr[maxIndex + 2]);
		System.out.println("Sum of triplet: " + max);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 12, 8, 20, 18, 22, 15, 13, 17 };
		new TripletWithMaxSum().getTripletWithMaxSum(arr);
	}
}
