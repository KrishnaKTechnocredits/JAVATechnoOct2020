/*Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)
*/
package poojap;

import java.util.Arrays;

public class UnionElement {

	public static double[] getUnionOfArray(double[] array1, double[] array2) {
		System.out.println(" Union Of Array is : ");
		double[] ans = new double[array1.length + array2.length];
		int k = 0;
		for (int i = 0; i < array1.length; i++) {
			boolean flag = true;
			double temp = array1[i];
			for (int j = 0; j < ans.length; j++) {
				if (temp == ans[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				ans[k] = array1[i];
				k++;
			}
		}
		for (int i = 0; i < array2.length; i++) {
			boolean flag = true;
			double temp = array2[i];
			for (int j = 0; j < ans.length; j++) {
				if (temp == ans[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				ans[k] = array2[i];
				k++;
			}
		}
		for (int j = 0; j < ans.length; j++) {
			System.out.print( ans[j] + ",");
		}
		return ans;
	}

	public static void main(String[] args) {
		UnionElement unionElement = new UnionElement();
		double[] array1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] array2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println(" Array1 : " + Arrays.toString(array1));
		System.out.println(" Array2 : " + Arrays.toString(array2));
		unionElement.getUnionOfArray(array1, array2);
	}
}
