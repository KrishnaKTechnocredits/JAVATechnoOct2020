package priyanka.Assignment30;

import java.util.Arrays;

/*Assignment 30 : 29th Nov 2020 
Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing, you need to write a Java program to find that missing number in an array.
*/

public class FindMissing {
	void findMissingNumber(int[] arr1, int[] arr2) {

		for (int i = 0; i < arr1.length; i++) {
			boolean flag = true;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.print("Missing Number:" + arr1[i] + " ");

		}
	}

	public static void main(String[] args) {
		FindMissing missingNumber = new FindMissing();
		int[] arr2 = { 12, 11, 1, 5, 6, 7, 2, 4, 3, 9, 10 };
		int[] arr1 = { 12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		System.out.println("Arrays is:" + Arrays.toString(arr1));
		missingNumber.findMissingNumber(arr1, arr2);

	}
}