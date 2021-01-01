package brijesh.assignment36;

import java.util.Arrays;

public class IntersectionOfArrays {
	public double[] getIntersectionOfArray(double[] inputArray1, double[] inputArray2) {
		System.out.println("Input Array1: " + Arrays.toString(inputArray1));
		System.out.println("Input Array2: " + Arrays.toString(inputArray2));
		double[] tempArray = new double[inputArray1.length < inputArray2.length ? inputArray1.length
				: inputArray2.length];
		int counter = 0;
		for (int i = 0; i < inputArray1.length; i++) {
			if (!isElementPresent(tempArray, inputArray1[i])) {
				for (int j = 0; j < inputArray2.length; j++) {
					if (inputArray1[i] == inputArray2[j]) {
						tempArray[counter++] = inputArray1[i];
						break;
					}
				}
			}
		}
		double[] intersection = new double[counter];
		for (int i = 0; i < intersection.length; i++)
			intersection[i] = tempArray[i];
		return intersection;
	}

	public boolean isElementPresent(double[] inputArray, double input) {
		for (int index = 0; index < inputArray.length; index++) {
			if (inputArray[index] == input)
				return true;
			else if(inputArray[index]==0.0)
				return false;
		}
		return false;
	}

	public static void main(String[] args) {
		IntersectionOfArrays intersectionOfArrays = new IntersectionOfArrays();
		double[] inputArray1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] inputArray2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		double intersection[] = intersectionOfArrays.getIntersectionOfArray(inputArray1, inputArray2);
		System.out.println("Intersection: " + Arrays.toString(intersection));
	}
}
