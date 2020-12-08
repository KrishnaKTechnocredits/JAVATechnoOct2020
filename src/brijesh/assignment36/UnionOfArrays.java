package brijesh.assignment36;

import java.util.Arrays;

/*
Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)
*/

public class UnionOfArrays {
	double[] union;
	int count = 0;

	public double[] getUnionOfArray(double[] inputArray1, double[] inputArray2) {
		System.out.println("Input Array1: "+Arrays.toString(inputArray1));
		System.out.println("Input Array2: "+Arrays.toString(inputArray2));
		union = new double[inputArray1.length + inputArray2.length];
		evaluate(inputArray1);
		evaluate(inputArray2);
		double[] union = new double[count];
		for (int i = 0; i < union.length; i++)
			union[i] = this.union[i];
		return union;
	}

	public void evaluate(double[] array) {
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
		double[] inputArray1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] inputArray2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		UnionOfArrays unionOfArrays = new UnionOfArrays();
		double[] union = unionOfArrays.getUnionOfArray(inputArray1, inputArray2);
		System.out.println("Union of two Arrays: "+Arrays.toString(union));
	}
}
