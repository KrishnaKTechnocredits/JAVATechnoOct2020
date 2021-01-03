package shrutiC.assignment36;

import java.util.Arrays;

public class ArrayIntersection {

	double[] finalArray;
	int count;
	
	void getArrayIntersection(double[] arr1, double[] arr2) {

		finalArray = new double[arr1.length < arr2.length ? arr1.length : arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					getIntersection(arr1[i]);
					break;
				}
			}
		}

		System.out.println("Intersection : " + Arrays.toString(finalArray));

	}

	void getIntersection(double value) {
		boolean flag = true;
		for (int j = 0; j < finalArray.length && finalArray[j] != 0.0; j++) {
			if (value == finalArray[j]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			finalArray[count++] = value;
		}
	}

	public static void main(String[] args) {
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };

		System.out.println("Array1 : " + Arrays.toString(arr1));
		System.out.println("Array2 : " + Arrays.toString(arr2));

		ArrayIntersection obj = new ArrayIntersection();
		obj.getArrayIntersection(arr1, arr2);
	}

}
