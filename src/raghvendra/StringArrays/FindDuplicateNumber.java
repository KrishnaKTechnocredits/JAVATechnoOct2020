package raghvendra.StringArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Program 2:  Find duplicate number on Integer array in Java? 
[I know you have done this before, practice it one more time please]
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.*/
public class FindDuplicateNumber {
	void findDuplicateNumberInArray(int[] arr) {
		boolean flag;
		System.out.println("Duplicate number in Array "+Arrays.toString(arr)+" are: ");
		for(int index=0;index<arr.length;index++) {
			flag=false;
			for(int innIndex=0;innIndex<arr.length;innIndex++) {
				if(arr[index]==arr[innIndex] && index>innIndex) {
					flag=true;
					break;
				}
			}
			if(flag) 
			System.out.println(arr[index]+" ");
		}
	}
	public static void main(String[] args) {
		FindDuplicateNumber findDuplicateNumber=new FindDuplicateNumber();
		int[] arr={0, 3,1, 2, 3};
		findDuplicateNumber.findDuplicateNumberInArray(arr);
		int[] arr1={0,0, 3,1, 2, 3,2};
		findDuplicateNumber.findDuplicateNumberInArray(arr1);
	}
}
