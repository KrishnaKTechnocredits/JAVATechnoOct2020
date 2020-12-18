package ruby;
/*Assignment 30 : 29th Nov 2020 */

public class Assignment30 {

	/* Program 1: Find the missing number in integer array of 1 to 10? Hint: You
	 * have given an integer array which contains numbers from 1 to 10 but exactly
	 * one number is missing, you need to write a Java program to find that missing
	 * number in an array.*/

	void findMissingNum(int[] input) {
		System.out.println("Missing number in array");
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i + 1] != (input[i] + 1)) {
				System.out.println(input[i] + 1);
			}
		}
	}

	/*
	 * Program 2: Find duplicate number on Integer array in Java? [I know you have
	 * done this before, practice it one more time please] Hint: There is exactly
	 * one number is repeated in the array. You need to write a program to find that
	 * duplicate number. For example, if an array with length 6 contains numbers {0,
	 * 3, 1, 2, 3}, then duplicated number is 3.
	 */

	void findDuplicate(int[] input) {
		System.out.println("Print Duplicate Number in Array");
		for (int index = 0; index < input.length; index++) {
			for (int j = index + 1; j < input.length; j++) {
				if (input[index] == input[j]) {
					System.out.println(input[index]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment30 assign = new Assignment30();
		int[] input = { 0, 3, 1, 2, 3, 2 };
		assign.findDuplicate(input);
		int[] in = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		assign.findMissingNum(in);
	}
}
