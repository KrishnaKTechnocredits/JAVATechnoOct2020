/*Program 1: WAP to Find Common Element Between Two Arrays

input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7

*/
package ankita.assignment.exam;

import java.util.Arrays;

public class Exam4CommonElementInArray {
	void getCommonElementInArray(int[] arr1, int[] arr2) {
		System.out.println("Input 1:" + Arrays.toString(arr1));
		System.out.println("Input 2:" + Arrays.toString(arr2));
		System.out.print("Common elements :");
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				boolean flag = false;
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j]) {
						flag = true;
						break;
					}
				}
				if (flag)
					System.out.print(arr1[i] + ",");
			}
		}
		else 
			System.out.println("Arrays of not equal length");
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int arr2[] = { 1, 0, 6, 15, 6, 4, 7, 0 };
		new Exam4CommonElementInArray().getCommonElementInArray(arr1, arr2);
	}
}