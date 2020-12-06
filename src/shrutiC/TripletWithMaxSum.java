package shrutiC;

import java.util.Arrays;

public class TripletWithMaxSum {

	void findTripletWithMaxSum(int[] array) {
		int sum = 0, maxSum = 0;
		int firstIndex = 0;
		System.out.println("Input Array : " + Arrays.toString(array));
		for (int i = 0; i < array.length; i = i + 3) {
			sum += array[i] + array[i + 1] + array[i + 2];
			if (sum > maxSum) {
				maxSum = sum;
				firstIndex = i;
			}
			sum = 0;
		}
		System.out.println("Triplets having maximum sum is : {" + array[firstIndex] + ", " + array[firstIndex + 1] + ", "
				+ array[firstIndex + 2]+"}");
		System.out.println("Sum : " + maxSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TripletWithMaxSum object = new TripletWithMaxSum();
		int[] array = { 10, 12, 8, 20, 18, 22, 15, 13, 17 };
		object.findTripletWithMaxSum(array);

	}

}
