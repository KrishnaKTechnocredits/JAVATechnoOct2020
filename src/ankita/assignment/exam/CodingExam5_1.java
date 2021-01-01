package ankita.assignment.exam;

import java.util.Arrays;

public class CodingExam5_1 {
	void getNumberOfVisibleTree(int[] arr) {
		System.out.println("Input :" + Arrays.toString(arr));
		int cnt = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				cnt++;
			}
		}
		if (arr[arr.length - 1] < arr[arr.length - 2])
			cnt++;
		System.out.println("Number of Trees Visible :" + cnt);
	}

	public static void main(String[] args) {
		int[] arr1 = { 3, 5, 5, 7, 9, 13, 11, 12 };
		int[] arr2 = { 11, 5, 13, 12, 16, 15 };
		CodingExam5_1 codingExam5_1 = new CodingExam5_1();
		codingExam5_1.getNumberOfVisibleTree(arr1);
		codingExam5_1.getNumberOfVisibleTree(arr2);

	}
}
