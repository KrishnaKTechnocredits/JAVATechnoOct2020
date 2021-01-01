package tejashree;

import java.util.Arrays;

/*
Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
      arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}
Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)
*/

public class Assignment36 {

	public static double[] getUnionOfArray(double[] array1, double[] array2) {
		System.out.println("Array1:" + Arrays.toString(array1));
		System.out.println("Array2:" + Arrays.toString(array2));
		System.out.println("\nUnion Of Array is:");
		double[] result = new double[array1.length + array2.length];
		int k = 0;
		for (int i = 0; i < array1.length; i++) {
			boolean flag = true;
			double num = array1[i];
			for (int j = 0; j < result.length; j++) {
				if (num == result[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				result[k] = array1[i];
				k++;
			}
		}
		for (int i = 0; i < array2.length; i++) {
			boolean flag = true;
			double num = array2[i];
			for (int j = 0; j < result.length; j++) {
				if (num == result[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				result[k] = array2[i];
				k++;
			}
		}

		for (int j = 0; j < result.length; j++) {
			System.out.print(result[j] + ",");
		}

		return result;
	}

	public static void main(String[] args) {
		double[] ip1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] ip2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		Assignment36.getUnionOfArray(ip1, ip2);
	}

}