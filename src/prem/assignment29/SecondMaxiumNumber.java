package prem.assignment29;

import java.util.Arrays;

public class SecondMaxiumNumber {
	
    /*Assignment - 29 : 26th Nov'2020 
	Find second maximum from array without sorting the array.
	int arr[] = { 25,36,87,60,9,8, 10};
	*/


		void secondMaxNum(int arr[]) {

			int max = arr[0];
			int secondMax = arr[1];
			for (int index = 0; index < arr.length; index++) {
				for (int innerIndex = 2; innerIndex < arr.length; innerIndex++) {
					if (arr[innerIndex] > max) {
						secondMax = max;
						max = arr[innerIndex];
					} else if (arr[innerIndex] > secondMax)
						secondMax = arr[innerIndex];
				}
			}
			System.out.println("The max no is " + max);
			System.out.println("The Second max no is " + secondMax);
		}

		public static void main(String[] arg) {
			SecondMaxiumNumber secondMaxNum = new SecondMaxiumNumber();
			int arr[] = { 200, 90, 25, 36, 87, 60, 9, 8, 10, 150, 20 };
			System.out.println("The Given array is :" + Arrays.toString(arr));
			secondMaxNum.secondMaxNum(arr);
		}
}

