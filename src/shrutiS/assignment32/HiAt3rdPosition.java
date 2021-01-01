/*Assignment  32
Program 2:  print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi*/

package shrutiS.assignment32;

import java.util.Arrays;

public class HiAt3rdPosition {
	
	public void threeConsecutiveNumbers(int[] input) {
		System.out.println("Given Array: " + Arrays.toString(input));
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index] + 2)
				System.out.println(input[index] + "," + input[index + 1] + "," + input[index + 2] + " -> Hi");
		}
	}

	public static void main(String[] args) {
		HiAt3rdPosition hiPosition = new HiAt3rdPosition();
		int[] input1 = { 1, 2, 3, 5, 8, 9, 11, 12, 13, 14, 15, 18, 19, 20 };
		int[] input2 = { 11, 12, 14, 15, 16, 19, 20, 21, 26, 27, 28, 29, 30, 31 };
		hiPosition.threeConsecutiveNumbers(input1);
		System.out.println("****************************************************");
		hiPosition.threeConsecutiveNumbers(input2);
	}
}
