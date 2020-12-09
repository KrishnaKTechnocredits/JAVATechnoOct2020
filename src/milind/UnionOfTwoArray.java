package milind;

import java.util.Arrays;

public class UnionOfTwoArray {
	double[] resultArray;
	int count = 0;

	public double[] getUnionOfArray(double[] inputArray1, double[] inputArray2) {
		resultArray = new double[inputArray1.length + inputArray2.length];
		unionOfArray(inputArray1);
		unionOfArray(inputArray2);
		return resultArray;
	}

	public void unionOfArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			boolean flag = true;
			for (int j = 0; j < resultArray.length; j++) {
				if (array[i] == resultArray[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				resultArray[count] = array[i];
				count++;
			}
		}
	}

	public static void main(String[] args) {
		double[] inputArray1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] inputArray2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		UnionOfTwoArray unionOfTwoArray = new UnionOfTwoArray();
		double[] union = unionOfTwoArray.getUnionOfArray(inputArray1, inputArray2);
		System.out.println("Union of two Arrays: "+Arrays.toString(union));
	}
}
