package apurva.Assignment_29;

import java.util.Arrays;

public class SecondMaxium {
	void secondMax(int[] input) {
		System.out.println("Given Array: " + Arrays.toString(input));
		int firstMax = 0, secondMax = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > firstMax) {
				secondMax = firstMax;
				firstMax = input[index];
			} else if (input[index] > secondMax && input[index] < firstMax) {
				secondMax = input[index];
			}
		}
		System.out.println("Second Maximum: " + secondMax);
	}

	public static void main(String[] args) {
		int[] array = { 2, 5, 8, 40, 1, 55, 6, 9 };
		new SecondMaxium().secondMax(array);

	}
}