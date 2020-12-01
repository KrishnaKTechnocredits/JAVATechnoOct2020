//Program 2:  Find duplicate number on Integer array in Java? [I know you have done this before, practice it one more time please]
//Hint: There is exactly one number is repeated in the array. You need to write a program to
//find that duplicate number.

package priya;

public class DuplicateNumberInArray {

	void displayDuplicateNum(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					System.out.println("Duplicate number in array is:" + arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		DuplicateNumberInArray duplicatenumber= new DuplicateNumberInArray();
		int array[] = { 0, 3, 1, 2, 3, 7, 8 };
		duplicatenumber.displayDuplicateNum(array);
	}
}
