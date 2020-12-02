package raghvendra.StringArrays;

import java.lang.reflect.Array;

/*Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing, 
you need to write a Java program to find that missing number in an array.*/
public class FindMissinNumberArray {
	void findMissingNumber(int[] arr) {
		boolean flag;
		System.out.println("Missing Numbers are: ");
		for(int index=1;index<11;index++) {
			flag=false;
			for(int innIndex=0;innIndex<arr.length;innIndex++) {
				if(index==arr[innIndex]) {
					flag=true;
					break;
				 }
			 }
			if(!flag)
			System.out.println(index);
		 }
	 }
	
	public static void main(String[] args) {
		FindMissinNumberArray findMissinNumberArray=new FindMissinNumberArray();
		int[] arr= {1,2,3,4,5,7,8,10};
		findMissinNumberArray.findMissingNumber(arr);
		int[] arr1= {2,1,4,5,7,8,10,3,9};
		findMissinNumberArray.findMissingNumber(arr1);
	}
}
