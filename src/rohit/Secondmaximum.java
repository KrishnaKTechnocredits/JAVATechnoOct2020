package rohit;
//Find second maximum from array without sorting the array.

import java.util.Arrays;

public class Secondmaximum {

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
		Secondmaximum secondmaximum = new Secondmaximum();
		int arr[] = { 10, 2, 30, 160, 210, 510, 5, 615, 100 };
		secondmaximum.secondmax(arr);
	}
}