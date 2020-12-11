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

		System.out.println("Arrays is:" + Arrays.toString(array));
		int temp = 0;
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			if (i + 1 != array[i]) {
				flag = true;
				temp = i + 1;
				break;
			}
		}
		if (flag)
			System.out.print("Missing Number:" + temp + "");
	}

	public static void main(String[] args) {
		FindMissing missingNumber = new FindMissing();
		int[] input = { 1,2,4,5,6,7,8,9,10};
		missingNumber.findMissingNumber(input);
	}
}