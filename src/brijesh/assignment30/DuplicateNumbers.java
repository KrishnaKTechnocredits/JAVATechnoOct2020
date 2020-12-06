package brijesh.assignment30;

import java.util.Arrays;

public class DuplicateNumbers {

	public void findDuplicateNumbers(int[] input) {
		System.out.println("Given Array: " + Arrays.toString(input));
		System.out.print("Duplicate Elements: ");
		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex]) {
					if (index < innerIndex) {
						System.out.print(input[index]+" ");
						break;
					}
					else if (index > innerIndex)
						break;
				}
			}
		}
		System.out.println("\n***********************************************************");
	}

	public static void main(String[] args) {
		int[] input1 = { 1, 3, 4, 2, 6, 3, 7, 8, 4, 9, 1 };
		int[] input2 = { 10, 2, 4, 5, 7, 9, 1, 3, 6, 3, 8, 9, 3, 45, 3 };
		DuplicateNumbers duplicateNumbers = new DuplicateNumbers();
		duplicateNumbers.findDuplicateNumbers(input1);
		duplicateNumbers.findDuplicateNumbers(input2);
	}
}
