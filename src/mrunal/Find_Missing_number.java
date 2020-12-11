package mrunal;
/*Assignment 30 : 29th Nov 2020 
Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10
 but exactly one number is missing, you need to write a Java program 
 to find that missing number in an array. */
import java.util.Arrays;
public class Find_Missing_number {

		void displayMissingNumber(int[] arr) {

			int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			System.out.println("Input : " + Arrays.toString(arr));
			System.out.print("Missing Number:");
			for (int i = 0; i < arr1.length; i++) {
				boolean flag = true;
				for (int j = 0; j < arr.length; j++) {
					if (arr1[i] != arr[j])
						continue;
					else {
						flag = false;
						break;
					}
				}
				if (flag)
					System.out.print(arr1[i]+", ");
			}
		}

		public static void main(String[] args) {
			int[] arr = { 1, 5, 6, 7, 2, 4, 8, 3,10};
			new Find_Missing_number().displayMissingNumber(arr);

		}
	}