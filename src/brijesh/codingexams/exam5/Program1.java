package brijesh.codingexams.exam5;

import java.util.Arrays;

public class Program1 {

	void countVisibleTrees(int[] inputArray) {
		System.out.println("Given tree array: " + Arrays.toString(inputArray));
		if (inputArray.length > 0) {
			int max = inputArray[0], count = 1;
			for (int index = 1; index < inputArray.length; index++) {
				if (inputArray[index] > max) {
					max = inputArray[index];
					count++;
				}
			}
			System.out.println("Person can see " + count + " trees");
		} else
			System.out.println("Person can not see any tree");
		System.out.println("**********************************************************");
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();
		int[] input1 = { 3, 5, 5, 7, 9, 13, 11, 12 };
		int[] input2 = { 11, 5, 13, 12, 16, 15 };
		int[] input3 = {1,30,20,33,10,22,44,67,34,24,78,100};
		int[] input4 = {};
		int[] input5 = {10};
		program1.countVisibleTrees(input1);
		program1.countVisibleTrees(input2);
		program1.countVisibleTrees(input3);
		program1.countVisibleTrees(input4);
		program1.countVisibleTrees(input5);
	}
}
