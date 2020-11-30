/*Assignment - 29 : 26th Nov'2020 
Find second maximum from array without sorting the array.*/
package poojap;

import java.util.Arrays;

public class Assignment29 {

	void findSecondMaximum(int[] array) {
		System.out.println("Array is : " + Arrays.toString(array));
		int firstMax = 0;
		int secondMax = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > firstMax) {
				secondMax = firstMax;
				firstMax = array[i];
			} else if (array[i] > secondMax && array[i] < firstMax) {
				secondMax = firstMax;
			}
		}
		System.out.println("First Max Number is : " + firstMax);
		System.out.println("Second Max Number is : " + secondMax);
	}

	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		int[] array = { 10, 50, 60, 25, 30 };
		assignment29.findSecondMaximum(array);
	}
}
