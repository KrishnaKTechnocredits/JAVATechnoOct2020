package sadhana;

/*Program 2:  Find duplicate number on Integer array in Java? 
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.*/

public class DuplicateElement_30 {

	void processData(int[] arr) {
		System.out.println("Duplicate elements in given array: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}

	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		new DuplicateElement_30().processData(input);

	}
}
