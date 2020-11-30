/*Program 2:  Find duplicate number on Integer array in Java? [I know you have done this before, practice it one more time please]
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3. */

package deepak.assignment30;

public class DuplicatesInIntArray {

	void findDuplictes(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j] ) {
					System.out.println("Duplicate Number in given array is :" + input[j]);
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int[] arr = {0,3,1,2,3};
		DuplicatesInIntArray duplicatesInIntArray = new DuplicatesInIntArray();
		duplicatesInIntArray.findDuplictes(arr);
	}
}
