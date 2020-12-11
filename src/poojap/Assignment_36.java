/*Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}
Output: 10.45, 18.35*/

package poojap;

import java.util.Arrays;

public class Assignment_36 {

	void findIntersection(double[] array1, double[] array2) {
		for (int i = 0; i < array1.length; i++) {
			boolean flag = false;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j] && i < j) {
					flag = true;
				}
			}
			if (flag)
				System.out.println(array1[i]);
		}
	}

	public static void main(String[] args) {
		Assignment_36 assignment_36 = new Assignment_36();
		double[] array1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] array2 = { 17.2, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println("Array 1 Is : " + Arrays.toString(array1));
		System.out.println("Array 2 Is : " + Arrays.toString(array2));
		assignment_36.findIntersection(array1, array2);
	}
}
