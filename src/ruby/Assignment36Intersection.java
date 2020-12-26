package ruby;

import java.util.Arrays;

public class Assignment36Intersection {

	public double[] getIntersectionOfArray(double[] arr1, double[] arr2) {
		System.out.println("Input Array1: " + Arrays.toString(arr1));
		System.out.println("Input Array2: " + Arrays.toString(arr2));
		double[] tempArray = new double[arr1.length < arr2.length ? arr1.length
				: arr2.length];
		int counter = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (!isElementPresent(tempArray, arr1[i])) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j]) {
						tempArray[counter++] = arr1[i];
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

	public boolean isElementPresent(double[] arr, double input) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == input)
				return true;
			else if(arr[index]==0.0)
				return false;
		}
		return false;
	}

	public static void main(String[] args) {
		Assignment36Intersection assign = new Assignment36Intersection();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		double intersection[] = assign.getIntersectionOfArray(arr1, arr2);
		System.out.println("Intersection: " + Arrays.toString(intersection));
	}
}
