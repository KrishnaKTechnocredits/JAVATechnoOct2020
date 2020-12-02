package priyanka.Assignment30;

import java.util.Arrays;

/*Program 2:  Find duplicate number on Integer array in Java? Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.
*/
public class DuplicateNumber {

	void findDuplicateNumber(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("The Duplicate number is " + arr[i]);
					break;
				}
			}
		}
	}

	public static void main(String[] arg) {
		DuplicateNumber duplicateNumber = new DuplicateNumber();
		int[] arr = { 1, 2, 4, 3, 5, 4, 7, 8, 6, 7, 1 };
		System.out.println("The given array is " + Arrays.toString(arr));
		duplicateNumber.findDuplicateNumber(arr);

	}

}
