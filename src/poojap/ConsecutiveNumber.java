/*Program 2:  print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi*/

package poojap;

import java.util.Arrays;

public class ConsecutiveNumber {

	void findConsecutiveNumber(int[] array) {
		System.out.println("Array Is: " + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 2) {
				if (array[i + 1] == array[i] + 1 && array[i + 2] == array[i] + 2) {
					System.out.println(array[i] + "," + array[i + 1] + "," + array[i + 2] + "--> Hi");
				}
			}
		}
	}

	public static void main(String[] args) {
		ConsecutiveNumber consecutiveNumber = new ConsecutiveNumber();
		int[] array = { 1, 2, 3, 4, 5, 8, 9, 11, 12, 13, 14, 15, 18, 19, 20 };
		consecutiveNumber.findConsecutiveNumber(array);
	}
}
