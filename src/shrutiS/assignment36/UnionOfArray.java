/*Assignment : 36
Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)*/

package shrutiS.assignment36;

import java.util.Arrays;

public class UnionOfArray {
	
	double[] union;
	int count = 0;
	
	public double[] getUnionOfArray(double[] array1, double[] array2) {
		System.out.println("Input Array1: "+Arrays.toString(array1));
		System.out.println("Input Array2: "+Arrays.toString(array2));
		union = new double[array1.length + array2.length];
		unionOfArray(array1);
		unionOfArray(array2);
		double[] union = new double[count];
		for (int i = 0; i < union.length; i++)
			union[i] = this.union[i];
		return union;
	}
	
	public void unionOfArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			boolean flag = true;
			for (int j = 0; j < union.length && union[j] != 0.0; j++) {
				if (array[i] == union[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				union[count++] = array[i];
			}
		}	
	}
	
	public static void main(String[] args) {
		double[] array1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] array2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		UnionOfArray unionOfArray = new UnionOfArray();
		double[] union = unionOfArray.getUnionOfArray(array1, array2);
		System.out.println("Union of two Arrays: "+Arrays.toString(union));
	}
	
}
