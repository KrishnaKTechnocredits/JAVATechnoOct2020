/*
 Return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524
*/

package yogita;

import java.util.Arrays;

public class ArmstrongNumberSum {

	void findArmstrongNumber(int[] array) {
		System.out.println("Array is:" + Arrays.toString(array));
		System.out.println("Armstrong Numbers Are:");

		int remainder = 0;
		int temp = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			temp = array[i];
			int sumOfAll = 0;

			while (temp != 0) {
				remainder = temp % 10;
				sumOfAll += (remainder * remainder * remainder);
				temp = temp / 10;
			}
			if (array[i] == sumOfAll)
				System.out.print(array[i] + ",");
			sum += array[i];
		}
		System.out.println("\nSum Of All Armstrong Numbers From Array is:" + sum);

	}

	public static void main(String[] args) {
		ArmstrongNumberSum findArmstrong = new ArmstrongNumberSum();
		int[] input = { 153, 111, 124, 371 };
		findArmstrong.findArmstrongNumber(input);
	}
}
