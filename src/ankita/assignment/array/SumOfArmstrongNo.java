/*Assignment - 35 : 4th Dec'2020 

return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524
*/
package ankita.assignment.array;

import java.util.Arrays;

public class SumOfArmstrongNo {
	void getSumOfArmstrongNo(int[] arr) {
		System.out.println("Input :" + Arrays.toString(arr));
		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			int number1 = 0;
			int number = 0;
			int sum = 0;
			number = arr[i];
			while (number > 0) {
				number1 = number % 10;
				sum = sum + (number1 * number1 * number1);
				number = number / 10;
			}
			if (sum == arr[i])
				totalSum += arr[i];
		}
		System.out.println("sum of all Armstrong number :" + totalSum);
	}

	public static void main(String[] args) {
		int[] arr = { 153, 111, 124, 371 };
		new SumOfArmstrongNo().getSumOfArmstrongNo(arr);
	}
}
