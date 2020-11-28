package brijesh.assignment29;

import java.util.Arrays;

/*
Find second maximum from array without sorting the array. 
*/

public class ArraySecondMax {

	public void findSecondMax(int[] input) {
		System.out.println("Input Array: " + Arrays.toString(input));
		if (input.length >= 2) {
			int max = input[0];
			int secondMax = input[1];
			for (int index = 2; index < input.length; index++) {
				if (input[index] > max) {
					max = input[index];
				} else if (input[index] > secondMax && input[index] != max)
					secondMax = input[index];
			}
			if(input.length==2) {
				if(secondMax>max) {
					int temp = max;
					max= secondMax;
					secondMax=temp;
				}
			}
			System.out.println("Second Max: " + secondMax);
			System.out.println("**************************************************");
		} else {
			System.out.println("Array length has to be 2 or more. Please provide valid array");
		}
	}

	public static void main(String[] args) {
		int[] input1 = { 10, 77, 20, 6, 40, 55, 33, 99 };
		int[] input2 = { -20, -5, 10, -67, -39, -10 };
		int[] input3 = { -10, 0, 20 };
		int[] input4 = { 9, 50 };
		int[] input5 = { 9 };
		ArraySecondMax arraySecondMax = new ArraySecondMax();
		arraySecondMax.findSecondMax(input1);
		arraySecondMax.findSecondMax(input2);
		arraySecondMax.findSecondMax(input3);
		arraySecondMax.findSecondMax(input4);
		arraySecondMax.findSecondMax(input5);
	}
}
