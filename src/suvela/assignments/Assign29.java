/*Assignment - 29 : 26th Nov'2020 
Find second maximum from array without sorting the array.*/
package suvela.assignments;

import java.util.Arrays;

public class Assign29 {
	void findSecondMax(int[] array) {
		System.out.println("Given array:" + Arrays.toString(array));
		int max = 0;
		int secondMax = 0;
		if (array[0] > array[1]) {
			max = array[0];
			secondMax = array[1];
		} else {
			max = array[1];
			secondMax = array[2];
		}
		for (int i = 2; i < array.length; i++) {
			int num = array[i];
			if (num > max) {
				secondMax = max;
				max = num;
			} else if (secondMax < num && num < max)
				secondMax = num;

		}
		System.out.println("second maximum number is:" + secondMax);
	}

	public static void main(String[] args) {
		int[] array = { 400, 200, 850, 250, 350, 900 };
		new Assign29().findSecondMax(array);

	}

}
