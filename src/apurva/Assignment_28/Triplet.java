package apurva.Assignment_28;

import java.util.Arrays;

public class Triplet {
	void tripletMaxSum(int[] input) {
		System.out.println("Given Array: " + Arrays.toString(input));
		int max = 0, maxIndex = 0;
		for (int index = 0; index < input.length; index = index + 3) {
			int sum = input[index] + input[index + 1] + input[index + 2];
			System.out.println("Sum of Triplet pair: " + input[index] + "," + input[index + 1] + "," + input[index + 2]
					+ " -> " + sum);
			if (sum > max) {
				max = sum;
				maxIndex = index;
			}
		}
		System.out.println("Triplet having max sum: " + input[maxIndex] + "," + input[maxIndex + 1] + ","
				+ input[maxIndex + 2] + " -> " + max);
	}

	public static void main(String[] args) {
		int[] input = { 10, 12, 8, 20, 18, 22, 15, 13, 17 };
		new Triplet().tripletMaxSum(input);
	}
}