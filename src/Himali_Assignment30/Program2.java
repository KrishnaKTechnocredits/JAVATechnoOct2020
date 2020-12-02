/*Program 2:  Find duplicate number on Integer array in Java? [I know you have done this before, practice it one more time please]
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3. */

package Himali_Assignment30;

public class Program2 {
	void findDuplicte(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println("Duplicate Number in given array is :" + array[j]);
					break;
				}

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 3, 1, 2, 3 };
		Program2 program2 = new Program2();
		program2.findDuplicte(arr);

	}

}
