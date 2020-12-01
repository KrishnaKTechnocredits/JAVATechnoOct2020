package vaibhav.assignment30;

import java.util.Arrays;

/*Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing,
you need to write a Java program to find that missing number in an array.*/

public class MissingNumberInArray {
	
	public static void findMissing(int [] a,int [] b){		
		for (int i = 0 ; i < b.length; i++) {
				int temp=a[i];
				b[temp-1]=temp;
		}		
		System.out.println("Missing number from an array is");
		for (int i = 0 ; i < b.length; i++) {
			if (b[i] == 0)
				System.out.print(" "+(i+1));
		}		
	}

	public static void main(String[] args) {
		int [] numbers= {9,6,7,9,4,3,1,2,1,5};
		int [] sorted = new int[numbers.length];
		MissingNumberInArray.findMissing(numbers,sorted);
	}

}
