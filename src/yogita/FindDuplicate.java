/*
 Find duplicate number on Integer array in Java? [I know you have done this before, practice it one more time please]
 Hint: There is exactly one number is repeated in the array. You need to write a program to
 find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.
*/

package yogita;

import java.util.Arrays;

class FindDuplicate {
	void findDuplicateNumber(int[] array) {
		System.out.println("Array Of Integer Is:" + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					flag = true;
					break;
				}
			}
			if (flag)
				System.out.println("Duplicate Number From array is:" + array[i]);
		}
	}

	public static void main(String[] args) {
		FindDuplicate duplicateNumber = new FindDuplicate();
		int[] input = { 1, 0, 3, 8, 9, 3 };
		duplicateNumber.findDuplicateNumber(input);
	}
}