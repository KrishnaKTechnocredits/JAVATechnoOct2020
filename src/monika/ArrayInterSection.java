package monika;
/*

Assignment : 36
 Program 2: Find intersection(common elements) of two arrays.
 
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35,18.35}
       arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}
Output: 10.45, 18.35
*/



import java.util.Arrays;

public class ArrayInterSection {
	void getIntersectionOfArray(double[] array1, double[] array2) {
		System.out.println("Array1:" + Arrays.toString(array1));
		System.out.println("Array2:" + Arrays.toString(array2));
		System.out.println("\nIntersection Of Array is:");

		for (int i = 0; i < array1.length; i++) {
			boolean flag = false;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j] && i < j) {
					flag = true;
					break;
				}
			}
			if (flag)
				System.out.print(array1[i] + ",");
		}
	}

	public static void main(String[] args) {
		ArrayInterSection findInterSection = new ArrayInterSection();
		double[] input1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] input2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		findInterSection.getIntersectionOfArray(input1, input2);
	}

}
