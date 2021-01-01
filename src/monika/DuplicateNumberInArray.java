package monika;
/*Assignment 30 


Program 2:  Find duplicate number on Integer array in Java? [I know you have done this before, practice it one more time please]
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3

*/


public class DuplicateNumberInArray {
	void findDuplicateNumber(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println("Duplicate number on integer array :" + array[j]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
	
		int[] array1 = { 1,2,3,3,4,4,5,6,7,8,8,9};
		DuplicateNumberInArray duplicateNumberinarray = new DuplicateNumberInArray();
		duplicateNumberinarray.findDuplicateNumber(array1);
		;
	}
}
