/*Assignment 30 : 29th Nov 2020 

Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing, you need to write a Java program to find that missing number in an array.
*/

package deepak.assignment30;

public class MissingNumberInArray {
	
	void findMissingNumber(int[] arr) {
		int missing=0;
		
		for(int i=0; i<arr.length; i++) {

			if(i+1 != arr[i]) {			
				missing = i+1;
				break;
			}	
		}
		System.out.println(missing);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,9,10,11};
		MissingNumberInArray missingNumberInArray = new MissingNumberInArray();
		missingNumberInArray.findMissingNumber(arr);
	}
}
