package priyanka.Assignment30;

import java.util.Arrays;

/*Assignment 30 : 29th Nov 2020 
Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing, you need to write a Java program to find that missing number in an array.
*/

public class FindMissing {
	void findMissingNumber(int[] arr) {
		
		//System.out.println("Given Array: "+Arrays.toString(input));
		int sum=0;
		int n= arr.length+1;
		int total =(n*(n+1))/2;
		for(int index=0; index<arr.length; index++) {
			sum+=arr[index];
		}
		//System.out.println("Total no is " + total);
		System.out.println("**********************************************");
		System.out.println("Missing Number is: "+(total-sum));
		
	}
	
	public static void main(String[] args) {
		FindMissing missingNumber = new FindMissing();
		int[] arr1 = { 1, 5, 6, 7, 2, 4, 3, 9, 10, 12, 8 };
		System.out.println("Arrays is:" + Arrays.toString(arr1));
		missingNumber.findMissingNumber(arr1);

	}
}