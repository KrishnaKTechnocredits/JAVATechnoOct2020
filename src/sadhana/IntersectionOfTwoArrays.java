package sadhana;

/*Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35 */


import java.util.Arrays;

public class IntersectionOfTwoArrays {

	int cnt = 0;

	double[] findCommonElements (double[] arr1, double[] arr2) {
		double[] arr3 = new double[arr1.length < arr2.length ? arr1.length : arr2.length];
		double[] arr4 = new double[arr1.length];
		int cnt1 = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					if (i <= j) {
						arr4[cnt1++] = arr1[i];
						break;
					} else if (i > j)
						break;
				}
			}
		}
		System.out.println("Array : " + Arrays.toString(arr4));

		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr4[i] == arr2[j]) {
					arr3[cnt++] = arr4[i];
					break;
				}
			}
		}
		return arr3;
	}

	public static void main(String[] args) {
		IntersectionOfTwoArrays intersectionofarray = new IntersectionOfTwoArrays();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };

		double[] arr3 = intersectionofarray.findCommonElements(arr1, arr2);
		System.out.print("Output :");
		for (int i = 0; i < intersectionofarray.cnt; i++) {
			System.out.print(arr3[i] + ", ");
		}
	}

}
