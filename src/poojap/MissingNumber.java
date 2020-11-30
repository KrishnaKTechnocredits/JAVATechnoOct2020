/*
 Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but 
exactly one number is missing, you need to write a Java program to find that missing 
number in an array.*/

package poojap;

import java.util.Arrays;

public class MissingNumber {
	void findMissingNumber(int[] arr) {
		int temp = 0;
		System.out.println("Array is : " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 != arr[i]) {
				temp = i + 1;
			}
		}
		System.out.println("Missing No is : " + temp);
	}

	public static void main(String[] args) {

		MissingNumber missingNumber = new MissingNumber();
		int[] arr = { 1, 5, 6, 7, 2, 4, 8, 3, 10 };
		missingNumber.findMissingNumber(arr);

	}
}
