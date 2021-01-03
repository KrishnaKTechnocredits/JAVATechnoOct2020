package deepak.assignment36;

import java.util.Arrays;

public class IntersectionOfArray {
	double[] resultArray;
	void arrayIntersection(double[] array1, double[] array2) {
		resultArray = new double[array1.length + array2.length];
		int count = 0;
		for(int index = 0; index < array1.length; index++) {
			int temp = isNumberProcessed(resultArray, array1[index]);
			for(int innerIndex = 0; innerIndex < array2.length; innerIndex++) {
				if(array1[index] == array2[innerIndex]) {
					if(temp <= 0) {
						resultArray[count] = array1[index];
						count++;
						break;
					}
				}
			}
		}
		System.out.println("Intersection array : " + Arrays.toString(resultArray));
	}

	int isNumberProcessed(double[] array, double number) {
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == number) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		double[] input1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] input2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		System.out.println("First Array : " + Arrays.toString(input1));
		System.out.println("Second Array : " + Arrays.toString(input2));
		IntersectionOfArray intersectionOfTwoArray = new IntersectionOfArray();
		intersectionOfTwoArray.arrayIntersection(input1, input2);
	}

}