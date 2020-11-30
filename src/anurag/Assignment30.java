/*Assignment 30 : 29th Nov 2020 

Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing, you need to write a Java program to find that missing number in an array.

Program 2:  Find duplicate number on Integer array in Java? [I know you have done this before, practice it one more time please]
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.*/

package anurag;

public class Assignment30 {

	void missingNumber(int[] ar) {
		int totalSum=0;
		int sum = 0;
		int missingNumber = 0;
		int length = ar.length;
		int n = ar[length-1];
		totalSum = n*(n+1)/2;
	//	System.out.println(totalSum);
		System.out.println("Program 1");
	
		
		for (int i =0; i<ar.length; i++) {
			sum = sum + ar[i];
		}
		missingNumber = totalSum - sum;
		System.out.println("Missing Number is: " + missingNumber);
		System.out.println();
	}
	
	void duplicateNumber(int[] arr) {
		
		System.out.println("Program 2");
		
		for (int i = 0; i <arr.length; i++) {
			int count=0;
			for (int j = i; j<arr.length; j++) {
				if (arr[i]==arr[j])
					count++;
			}
			if(count>1)
				System.out.println("Duplicate number: " + arr[i]);
		}
	}
	
	public static void main(String[] args) {
	
		Assignment30 assignment30 = new Assignment30();
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 10};
		assignment30.missingNumber(input);
		
		int[] arr = {10, 12, 55, 32, 17, 12, 32 };
		assignment30.duplicateNumber(arr);
		
	}
}
