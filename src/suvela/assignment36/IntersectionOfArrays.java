/*Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}*/
package suvela.assignment36;

import java.util.Arrays;

public class IntersectionOfArrays {
	double[] getIntersection(double[] arr1, double[] arr2) {
		System.out.println("Given arrays:"+Arrays.toString(arr1)+" "+Arrays.toString(arr2));
		double[] arr3 = new double[arr1.length];
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					if (i <= j) 
						arr3[count++] = arr1[i];
					else if(i>j)
						break;
				} 
			}
		}
		return arr3;
	}

	public static void main(String[] args) {
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		IntersectionOfArrays ia = new IntersectionOfArrays();
		double[] arr3 = ia.getIntersection(arr1, arr2);
		System.out.print("Intersection of the arrays:");
		for (int i = 0; i < arr3.length; i++) {
			if(arr3[i]!=0)
			System.out.print(arr3[i] + ",");
		}
	}

}
