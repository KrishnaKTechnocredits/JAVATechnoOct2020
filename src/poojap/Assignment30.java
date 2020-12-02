/*Program 2:  Find duplicate number on Integer array in Java? [I know you have done this before, practice it one more time please]
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.*/

package poojap;

public class Assignment30 {

	void findDuplicateNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					flag = true;
				}
			}
			if (flag) {
				System.out.println("Duplicate No is : " + array[i]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		int[] array = { 0, 3, 1, 2, 3 };
		assignment30.findDuplicateNumber(array);
	}
}
