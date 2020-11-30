/*
 * 
 *Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing, 
you need to write a Java program to find that missing number in an array.
*/

package yogita;

import java.util.Arrays;

public class FindMissing {
	void findMissingNumber(int[] array) {

		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Arrays is:" + Arrays.toString(array));

		for (int i = 0; i < input.length; i++) {
			boolean flag = true;
			for (int j = 0; j < array.length; j++) {
				if (input[i] != array[j])
					continue;
				else {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.print("Missing Number:" + input[i] + "");
		}
	}

	public static void main(String[] args) {
		FindMissing missingNumber = new FindMissing();
		int[] array = { 1, 5, 6, 7, 2, 4, 8, 9, 10 };
		missingNumber.findMissingNumber(array);
	}
}