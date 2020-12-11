/*Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing, 
you need to write a Java program to find that missing number in an array.*/

package shrutiS.assignment30;

public class MissingNumber {

	void getInputArray(int[] input) {
		System.out.print("Input array = ");
		for (int index = 0; index < input.length; index++) {
			System.out.print(input[index] + " ");
		}
	}

	// when input is sorted
	void findMissingNumber(int[] input) {
		int sum = 0;
		// sum of n natural numbers is [(n*(n+1))/2]
		int totalNumbers = 55;
		for (int index = 0; index < input.length; index++) {
			sum += input[index];
		}
		int missingNumber = totalNumbers - sum;
		if (missingNumber != 0)
			System.out.println("\nMissing no is " + missingNumber);
		else
			System.out.println("\nThere is no missing number");
	}

	public static void main(String[] args) {
		MissingNumber missingNo = new MissingNumber();
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		missingNo.getInputArray(input);
		missingNo.findMissingNumber(input);
	}
}
