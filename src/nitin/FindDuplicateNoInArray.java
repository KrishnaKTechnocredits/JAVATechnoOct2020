package nitin;
import java.util.Arrays;
/* Assignment 30 : 29th Nov 2020 - Program 2:  Find duplicate number on Integer array in Java? 
 * [I know you have done this before, practice it one more time please]
Hint: There is exactly one number is repeated in the array. You need to write a program to find that duplicate number. 
For example, if an array with length 6 contains numbers {0, 3,1, 2, 3}, then duplicated number is 3.*/
public class FindDuplicateNoInArray {
	public void getDuplicateNoInArray(int[] arr) {
		System.out.println("Input Array --> "+Arrays.toString(arr));
		int num=0;
		for(int index=0;index<arr.length-1;index++) {
			for(int inner=index+1;inner<arr.length;inner++) {
				if(arr[index]==arr[inner]) {
					num=arr[inner];
				}	
			}
		}
		System.out.println("Duplicate number in the Input array --> "+num);
	}
	public static void main(String[] args) {
		FindDuplicateNoInArray findDuplicateNoInArray = new FindDuplicateNoInArray();
		int[] input= {0,3,1,2,3,5,6,1,3,5,5,5}; 
		findDuplicateNoInArray.getDuplicateNoInArray(input);
	}
}
