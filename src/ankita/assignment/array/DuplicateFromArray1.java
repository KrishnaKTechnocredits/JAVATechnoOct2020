/*Program 2:  Find duplicate number on Integer array in Java? [I know you have done this before, practice it one more time please]
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.*/
package ankita.assignment.array;

import java.util.Arrays;

public class DuplicateFromArray1 {
	void findDuplicateFromArray1(int[] arr) {
		System.out.print("Input :" + Arrays.toString(arr) + "\nDuplicate elements : ");

		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag)
				System.out.print(arr[i] + ",");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 6, 5, 1, 6, 3 };
		new DuplicateFromArray1().findDuplicateFromArray1(arr);
	}
}
