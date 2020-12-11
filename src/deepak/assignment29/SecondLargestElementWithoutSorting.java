/* Find the second largest element in given areay 
 * int[] arr = { 2, 5, 8, 40, 1, 55, 6, 9 };
 * */

package deepak.assignment29;

import java.util.Arrays;

public class SecondLargestElementWithoutSorting {

	void secondmax(int arr[]) {
		System.out.println("Array is- " + Arrays.toString(arr));
		int maxnum1 = 0;
		int maxnum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxnum1) {
				maxnum2 = maxnum1;
				maxnum1 = arr[i];
			} else if (arr[i] > maxnum2 && arr[i] < maxnum1) {
				maxnum2 = arr[i];
			}
		}
		System.out.println("Second maximum number is- " + maxnum2);
	}

	public static void main(String[] arg) {
		SecondLargestElementWithoutSorting secondmaximum = new SecondLargestElementWithoutSorting();
		int arr[] = {2, 5, 8, 40, 1, 55, 6, 9};
		secondmaximum.secondmax(arr);
	}
}