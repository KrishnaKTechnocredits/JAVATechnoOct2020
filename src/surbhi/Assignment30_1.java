package surbhi;
import java.util.Arrays;

public class Assignment30_1 {

	public void findMissingNumber(int[] input) {
		System.out.println("Given Array: " + Arrays.toString(input));
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			sum += input[index];
		}
		System.out.println("Missing Number is: " + (55 - sum));
		System.out.println("**********************************************8");
	}

	public static void main(String[] args) {
		int[] input1 = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int[] input2 = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		Assignment30_1 missingNumber = new Assignment30_1();
		missingNumber.findMissingNumber(input1);
		missingNumber.findMissingNumber(input2);
	}

}
