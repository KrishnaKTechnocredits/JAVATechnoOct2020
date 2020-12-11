package shrutiC;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOperations {

	void findMissingNumInArray(int[] array) {

		System.out.println("Input Array - " + Arrays.toString(array));

		// Calculate the sum of the numbers till last num in array
		// Missing num = expectedSum - ActualSum
		int n = array.length + 1;
		int expectedSum = (n * (n + 1)) / 2;

		// Calculate actual sum of numbers in an array
		int actualSum = 0;
		for (int index = 0; index < array.length; index++) {
			actualSum += array[index];
		}
		System.out.println("Missing num in array is : " + (expectedSum - actualSum));
	}

	void findDuplicateNumInArray(int[] array) {
		int num = 0;

		System.out.println("Input Array: " + Arrays.toString(array));
		System.out.print("Duplicate num in array is : ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					num = array[j];
					break;
				}
			}
		}
		System.out.print(" " + num);
	}

	public static void main(String[] args) {

		ArrayOperations object = new ArrayOperations();

		// Find duplicate numbers in array
		int[] array = { 0, 2, 1, 2, 3, 0, 2 };
		object.findDuplicateNumInArray(array);
		System.out.println("\n**********************************************************************\n");

		// Find missing number in an array
		int[] array1 = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		object.findMissingNumInArray(array1);

	}

}
