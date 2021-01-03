/* Assignment : 36 [6th Dec'2020] 
Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30} 
 
Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2) */

package sadhana;
import java.util.Arrays;

public class UnionOfArrays {

	public static double[] findUnionOfArrays(double[] arr1, double[] arr2) {
		System.out.println("Input Array one:" + Arrays.toString(arr1));
		System.out.println("Input Array two:" + Arrays.toString(arr2));
		System.out.println("Union Of two Array is:");
		double[] result = new double[arr1.length + arr2.length];
		int k = 0;
		for (int i = 0; i < arr1.length; i++) {
			boolean flag = true;
			double num = arr1[i];
			for (int j = 0; j < result.length; j++) {
				if (num == result[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				result[k] = arr1[i];
				k++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			boolean flag = true;
			double num = arr2[i];
			for (int j = 0; j < result.length; j++) {
				if (num == result[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				result[k] = arr2[i];
				k++;
			}
		}

		for (int j = 0; j < result.length; j++) {
			System.out.print(result[j] + ",");
		}

		return result;
	}

	public static void main(String[] args) {
		double[] inputArr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] inputArr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		UnionOfArrays.findUnionOfArrays(inputArr1, inputArr2);
	}

}