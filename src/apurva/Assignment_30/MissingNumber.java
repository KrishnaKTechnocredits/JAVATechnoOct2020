package apurva.Assignment_30;

/*Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing, 
you need to write a Java program to find that missing number in an array.*/

import java.util.Arrays;

public class MissingNumber {
	void getMissingNumber(int[] input) {
		System.out.println("Given Array: " + Arrays.toString(input));
		for (int i = 0; i < input.length; i++) {
			System.out.print("Missing Number: ");
			for (int j = 1; j <= 10; j++) {
				if (i < input.length && j == input[i])
					i++;
				else
					System.out.print(j + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 6, 7, 9, 10 };
		new MissingNumber().getMissingNumber(input);
	}
}