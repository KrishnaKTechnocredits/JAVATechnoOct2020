package mrunal;
/* Assignment 28 - 
 * find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60
 */
import java.util.Scanner;
public class triplet_MaxSum {
	
	static int count;
	int newMax = 0;

	void tripletSummationLogic(int[] arr, int number) {
		int max = 0;
		{
			for (int index = 0; index < number; index++) {
				max = max + arr[index];
			}
			if (newMax < max) {
				newMax = max;
			}
		}
	}

	void tripletPassingToLogic(int[] arr, int length, int number) {
		int[] temp = new int[number];
		int count = 0;
		for (int index = count; index < length; index++) {
			temp[count] = arr[index];
			count++;
			if (count == number) {
				tripletSummationLogic(temp, number);
				count = 0;
			}
		}
		System.out.println("Maximum sum of " +number+ ""
				+ " number from list of integer array is: " +newMax);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the length of integer array: ");
		int length = scanner.nextInt();
		
		System.out.println("Enter the number to find the summation and printing."
				+ " Ex: For triplet: 3");
		int number = scanner.nextInt();
		
		int[] arr = new int[length]; // {10,12,8,11,20,9,2,2,2,5,10};
		
		for (int index = 0; index < length; index++) {
			System.out.println("Enter the element: " + (index + 1));
			arr[index] = scanner.nextInt();
		}
		
		triplet_MaxSum arrayTripletSummation = new triplet_MaxSum();
		arrayTripletSummation.tripletPassingToLogic(arr, length, number);
		scanner.close();
	}

}