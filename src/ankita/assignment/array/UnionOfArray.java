/*Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)
*/
package ankita.assignment.array;

import java.util.Arrays;

public class UnionOfArray {
	int cnt = 0;

	double[] getUnionOfArray(double[] arr1, double[] arr2) {
		System.out.println("Input :\n" + Arrays.toString(arr1) + "\n" + Arrays.toString(arr2));
		double[] arr3 = new double[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					if (i <= j) {
						arr3[cnt++] = arr1[i];
						break;
					} else if (i > j)
						break;
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				if (arr2[i] == arr2[j]) {
					int z = 0;
					boolean flag = false;
					while (z < arr3.length) {
						if (arr2[i] == arr3[z++]) {
							flag = true;
							break;
						}
					}
					if (!flag) {
						if (i <= j) {
							arr3[cnt++] = arr2[i];
							break;
						} else if (i > j)
							break;
					}
				}
			}
		}
		return arr3;
	}

	public static void main(String[] args) {
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };

		UnionOfArray ofArray = new UnionOfArray();
		double[] arr3 = ofArray.getUnionOfArray(arr1, arr2);

		System.out.print("Output : ");
		for (int i = 0; i < ofArray.cnt; i++) {
			System.out.print(arr3[i] + ", ");
		}
	}
}