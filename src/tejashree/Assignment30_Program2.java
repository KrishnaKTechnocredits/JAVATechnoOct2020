package tejashree;

public class Assignment30_Program2 {
	/*
	 * Program 1: Find the missing number in integer array of 1 to 10? Hint: You
	 * have given an integer array which contains numbers from 1 to 10 but exactly
	 * one number is missing, you need to write a Java program to find that missing
	 * number in an array.
	 */

	void findMissingNumber(int[] input) {
		int missingNum = 0;
		for (int i = 0; i < input.length; i++) {
			if (i + 1 != input[i]) {
				missingNum = i + 1;
				break;
			}
		}
		System.out.println("Missing Number is : " + missingNum);
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		Assignment30_Program2 missingNumber = new Assignment30_Program2();
		missingNumber.findMissingNumber(input);

	}
}
