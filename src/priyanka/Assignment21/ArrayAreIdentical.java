package priyanka.Assignment21;

import java.util.Arrays;

/*Assignment 21 : 17th Nov'2020  

WAP to find given 2 arrays are identical or not. 
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,55,32,17};
output : Identical
--------------------------------------------
int[] arr1 = {10,12,55,32,17,99};
int[] arr2 = {10,12,55,32,17}};
output : Not identical
------------------------------------
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,99,32,17}};
output : Not Identical		
*/
public class ArrayAreIdentical {

	void isidenticalArray(int[] arr1, int[] arr2) {

		boolean flag = true;
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					flag = false;
				}
			}
			if (flag)
				System.out.println(" The arrays are : Identical");
			else
				System.out.println(" The arrays are :  Not Identical");
		} else
			System.out.println(" The arrays are : Not Identical");
	}

	public static void main(String[] arg) {
		ArrayAreIdentical arrayAreIdentical = new ArrayAreIdentical();
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		int[] arr4 = { 10, 12, 55, 32, 17 };
		int[] arr5 = { 10, 12, 55, 32, 17 };
		int[] arr6 = { 10, 12, 99, 32, 17 };
		System.out.println("First Array is :" + Arrays.toString(arr1));
		System.out.println("Second Array is :" + Arrays.toString(arr2));
		arrayAreIdentical.isidenticalArray(arr1, arr2);
		System.out.println("******************************************************");
		System.out.println("First Array is :" + Arrays.toString(arr3));
		System.out.println("Second Array is :" + Arrays.toString(arr4));
		arrayAreIdentical.isidenticalArray(arr3, arr4);
		System.out.println("******************************************************");
		System.out.println("First Array is :" + Arrays.toString(arr5));
		System.out.println("Second Array is :" + Arrays.toString(arr6));
		arrayAreIdentical.isidenticalArray(arr5, arr6);
	}
}
