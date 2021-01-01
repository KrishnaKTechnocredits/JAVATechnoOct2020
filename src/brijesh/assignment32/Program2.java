package brijesh.assignment32;

import java.util.Arrays;

/*
print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi
*/

public class Program2 {

	public void threeConsecutiveNumbers(int[] numArray) {
		System.out.println("Given Array: " + Arrays.toString(numArray));
		for (int index = 0; index < numArray.length - 2; index++) {
			if (numArray[index + 1] == numArray[index] + 1 && numArray[index + 2] == numArray[index] + 2)
				System.out.println(numArray[index] + "," + numArray[index + 1] + "," + numArray[index + 2] + " -> Hi");
		}
		System.out.println("****************************************************");
	}

	public static void main(String[] args) {
		Program2 program2 = new Program2();
		int[] input1 = { 1, 2, 3, 5, 8, 9, 11, 12, 13, 14, 15, 18, 19, 20 };
		int[] input2 = { 11, 12, 14, 15, 16, 19, 20, 21, 26, 27, 28, 29, 30, 31 };
		program2.threeConsecutiveNumbers(input1);
		program2.threeConsecutiveNumbers(input2);
	}
}
