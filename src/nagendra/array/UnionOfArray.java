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

		double[] input = new double[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, input, 0, arr1.length);
		System.arraycopy(arr2, 0, input, arr1.length, arr2.length);
		double[] output = new double[input.length];
		int i = -000;
		for (int j = 0; j < input.length; j++) {
			for (int k = 0; k < input.length; k++) {
				if (input[j] == input[k] && j != k) {
					input[k] = i;
				}
			}
			if (input[j] != i) {
				output[j] = input[j];
			}
		}
		return output;
	}

	public static void main(String[] args) {

		UnionOfArray array = new UnionOfArray();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		double[] output = array.getUnionOfArray(arr1, arr2);
		for (int i = 0; i < output.length; i++) {
          if(output[i]!=0.0)
        	  System.out.print(output[i]+" ,");
		}
	}
}
