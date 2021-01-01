package sadhana;

import java.util.Arrays;

public class IsIdenticalNotIdenticalArray {

	void printData(int[] a1, int[] a2) {
		boolean flag = true;
		if (a1.length == a2.length) {
			for (int index = 0; index < a1.length; index++) {
				if (a1[index] != a2[index]) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("Given Array is identical");
			else
				System.out.println("Given Array is not identical");
		} else
			System.out.println("Array not found");
	}

	public static void main(String[] args) {
		IsIdenticalNotIdenticalArray isIdenticalNotIdenticalArray = new IsIdenticalNotIdenticalArray();
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		System.out.println("arr1 :" + Arrays.toString(arr1));
		System.out.println("arr2 :" + Arrays.toString(arr2));
		isIdenticalNotIdenticalArray.printData(arr1, arr2);
		int[] arr3 = { 10, 12, 55, 32, 17 };
		int[] arr4 = { 10, 12, 99, 32, 17 };
		System.out.println("arr3 :" + Arrays.toString(arr3));
		System.out.println("arr4 :" + Arrays.toString(arr4));
		isIdenticalNotIdenticalArray.printData(arr3, arr4);	
		int[] arr5 = { 10, 12, 55, 32, 17, 99 };
		int[] arr6 = { 10, 12, 55, 32, 17 };
		System.out.println("arr5 :" + Arrays.toString(arr5));
		System.out.println("arr6 :" + Arrays.toString(arr6));
		isIdenticalNotIdenticalArray.printData(arr5, arr6);

	}

}
