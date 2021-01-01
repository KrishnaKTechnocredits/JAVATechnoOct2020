package suvela.exams.exam5;

import java.util.Arrays;

public class Program1 {
	void findNumberOfTress(int[] arr) {
		System.out.println("Array:" + Arrays.toString(arr));
		int num = 0, count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			num = arr[i];
			if (num < arr[i + 1])
				count++;
		}
		if (arr[arr.length - 1] < arr[arr.length - 2])
			count++;
		System.out.println("Number of trees visible: " + count);
	}

	public static void main(String[] args) {
		int[] array = { 3, 5, 5, 7, 9, 13, 11, 12 };
		Program1 pr = new Program1();
		pr.findNumberOfTress(array);
		int[] array1 = { 11, 5, 13, 12, 16, 15 };
		pr.findNumberOfTress(array1);

	}

}
