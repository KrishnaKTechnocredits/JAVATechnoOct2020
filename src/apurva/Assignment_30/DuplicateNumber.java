package apurva.Assignment_30;

/*Program 2:  Find duplicate number on Integer array in Java? 
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.*/

import java.util.Arrays;

public class DuplicateNumber {
	void getDuplicateNumber(int[] input) {
		System.out.println("Given Array: " + Arrays.toString(input));
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j])
					System.out.println("Duplicate Number: " + input[j]);
			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 0, 3, 1, 2, 3 };
		new DuplicateNumber().getDuplicateNumber(input);
	}
}