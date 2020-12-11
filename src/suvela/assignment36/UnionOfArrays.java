
/*
Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}*/
package suvela.assignment36;

import java.util.Arrays;

public class UnionOfArrays {
	double[] getUnion(double[] arr1, double[] arr2) {
		System.out.println("Given arrays are:" + Arrays.toString(arr1) + " " + Arrays.toString(arr2));
		double[] arr3 = new double[arr1.length + arr2.length];
		int count = 0;
		int temp = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					temp = count++;
					if (i <= j) {
						arr3[temp] = arr1[i];
						break;
					} else if (i > j)
						break;
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			boolean flag = true;
			for (int j = 0; j < arr3.length; j++) {
				if (arr3[j] == arr2[i]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				arr3[temp] = arr2[i];
				temp++;
			}
		}
		return arr3;
	}

	// 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33

	public static void main(String[] args) {
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		UnionOfArrays ua = new UnionOfArrays();
		double[] arr3 = ua.getUnion(arr1, arr2);
		System.out.println("Union of two arrays:");
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] != 0)
				System.out.print(arr3[i] + ",");
		}
	}
}
