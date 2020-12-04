package priyanka.Assignment32;

import java.util.Arrays;

/*Program 2:  print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi*/

public class ConsecutiveNumbers {

	void findConsecutiveNumbers(int arr[]) {

		for (int i = 0; i < arr.length - 2; i++) {

			if (arr[i] + 1 == arr[i + 1] && arr[i] + 2 == arr[i + 2]) {

				System.out.println(arr[i] + ", " + arr[i + 1] + ", " + arr[i + 2] + " -> Hi");
			}
		}
	}

	public static void main(String[] arg) {
		ConsecutiveNumbers consecutiveNumbers = new ConsecutiveNumbers();
		int arr[] = { 1, 2, 3, 5, 8, 9, 11, 12, 13, 14, 15, 18, 19, 20, 3, 4, 1 };
		System.out.println("The Given Array  is: " + Arrays.toString(arr));
		consecutiveNumbers.findConsecutiveNumbers(arr);
	}

}
