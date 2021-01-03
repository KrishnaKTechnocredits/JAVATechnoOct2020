package monika;
/*

 Assignment : 36 [6th Dec'2020] 
Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
       arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}
Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)
*/



import java.util.Arrays;

public class ArrayUnion {

	public static double[] getUnionOfArray(double[] array1, double[] array2) {
		System.out.println("Array1:" + Arrays.toString(array1));
		System.out.println("Array2:" + Arrays.toString(array2));
		System.out.println("\nUnion Of Array is:");
		double[] result = new double[array1.length + array2.length];
		int k = 0;
		for (int i = 0; i < array1.length; i++) {
			boolean flag = true;
			double num = array1[i];
			for (int j = 0; j < result.length; j++) {
				if (num == result[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				result[k] = array1[i];
				k++;
			}
		}
		for (int i = 0; i < array2.length; i++) {
			boolean flag = true;
			double num = array2[i];
			for (int j = 0; j < result.length; j++) {
				if (num == result[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				result[k] = array2[i];
				k++;
			}
		}

		for (int j = 0; j < result.length; j++) {
			System.out.print(result[j] + ",");
		}

		return result;
	}

	public static void main(String[] args) {
		ArrayUnion findUnion = new ArrayUnion();
		double[] input1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] input2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		findUnion.getUnionOfArray(input1, input2);
	}

}