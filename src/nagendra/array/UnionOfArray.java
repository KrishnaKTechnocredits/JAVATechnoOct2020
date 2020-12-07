package nagendra.array;

/*
Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
       arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}
Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)
*/

public class UnionOfArray {

	double[] getUnionOfArray(double[] arr1, double[] arr2) {
		double[] userInput1 = UnionOfArray.removeDuplicateFromArray(arr1);
		double[] userInput2 = UnionOfArray.removeDuplicateFromArray(arr2);
		double[] output = new double[userInput1.length + userInput2.length];
		int count = 0;
		int num = 0;
		boolean flag = false;
		for (int i = 0; i < userInput2.length; i++) {
			output[i] = userInput1[i];
			flag = true;
			for (int j = 0; j < userInput1.length; j++) {
				if (userInput2[i] == userInput1[j]) {
					num++;
					flag = false;
					break;
				} else {
					flag = true;
					continue;
				}
			}
			if (flag) {
				output[userInput1.length + count] = userInput2[i];
				count++;
			}
		}
		double[] systemOutput = new double[output.length - num];
		for (int k = 0; k < systemOutput.length; k++) {
			systemOutput[k] = output[k];
		}
		return systemOutput;
	}

	static double[] removeDuplicateFromArray(double[] input) {
		int count = 0;
		int num = 0;
		boolean flag = true;
		double[] output = new double[input.length];
		for (int i = 0; i < input.length; i++) {
			flag = true;
			for (int j = 0; j < input.length; j++) {
				if (input[i] == input[j] && i > j) {
					flag = false;
					num++;
					break;
				}
			}
			if (flag)
				output[count] = input[i];
			count++;
		}
		double[] sysOutput = new double[output.length - num];

		for (int k = 0; k < sysOutput.length; k++) {
			sysOutput[k] = output[k];
		}
		return sysOutput;
	}

	public static void main(String[] args) {

		UnionOfArray array = new UnionOfArray();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		double[] output = array.getUnionOfArray(arr1, arr2);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ,");
		}
	}
}
