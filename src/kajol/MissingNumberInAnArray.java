/*Assignment 30 : 29th Nov 2020 

Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10
 but exactly one number is missing, you need to write a Java program to 
 find that missing number*/

package kajol;

import java.util.Arrays;

public class MissingNumberInAnArray {
	void findMissingnumber(int []inputArray) {
		System.out.println("Given array is : "+Arrays.toString(inputArray));	
		int n=inputArray.length;
		int sum=(n+1)*(n+2)/2;
		int sumOfArrayElements=0;
		for(int index=0;index<n;index++) {
			sumOfArrayElements+=inputArray[index];
		}
		int misssingNumber=sum-sumOfArrayElements;
		System.out.println("Missing Number is : "+misssingNumber);		
	}
	
	public static void main(String[] args) {
		int []inputArray= {1,2,3,4,5,7,8,9,10};
		new MissingNumberInAnArray().findMissingnumber(inputArray);
	}
}
