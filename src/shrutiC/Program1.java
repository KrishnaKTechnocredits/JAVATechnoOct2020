package shrutiC;

import java.util.Arrays;

public class Program1 {

	void getNumOfVisibleTrees(int[] array) {
		System.out.println("Input array : " + Arrays.toString(array));
		int maxNum = array[0];
		int counter = 1;
		try {
			for (int i = 1; i < array.length; i++) {
				if (array[i] > maxNum) {
					counter++;
					maxNum = array[i];
				}
			}
			System.out.println("Number of trees visible to man are : " + counter);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Incorrect array");
		}
	}

	public static void main(String[] args) {

		Program1 object = new Program1();
		int array[] = { 3, 5, 5, 7, 9, 13, 11, 12 };
		object.getNumOfVisibleTrees(array);
		System.out.println("\n**********************************************************");
		int[] array1 = { 11, 5, 13, 12, 16, 15 };
		object.getNumOfVisibleTrees(array1);
	}

}