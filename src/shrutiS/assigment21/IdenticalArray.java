/*Assignment 21 : 17th Nov'2020  
 
 WAP to find given 2 arrays are identical or not. 
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,55,32,17}};
output : Identical
--------------------------------------------
int[] arr1 = {10,12,55,32,17,99};
int[] arr2 = {10,12,55,32,17}};
output : Not identical
------------------------------------
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,99,32,17}};
output : Not Identical*/

package shrutiS.assigment21;

import java.util.Arrays;

public class IdenticalArray {

	void findIdenticalArrya(int[] arr1, int[] arr2) {
		boolean flag = true;
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("Array is Identical");
			else
				System.out.println("Array is not Identical");
		} else
			System.out.println("Array is not Identical");
	}

	public static void main(String[] args) {
		IdenticalArray identicalArray = new IdenticalArray();
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		System.out.println("arr1 :" + Arrays.toString(arr1));
		System.out.println("arr2 :" + Arrays.toString(arr2));
		identicalArray.findIdenticalArrya(arr1, arr2);
		System.out.println("***************************************************");
		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		int[] arr4 = { 10, 12, 55, 32, 17 };
		System.out.println("arr1 :" + Arrays.toString(arr3));
		System.out.println("arr2 :" + Arrays.toString(arr4));
		identicalArray.findIdenticalArrya(arr3, arr4);
		System.out.println("***************************************************");
		int[] arr5 = { 10, 12, 55, 32, 17 };
		int[] arr6 = { 10, 12, 99, 32, 17 };
		System.out.println("arr1 :" + Arrays.toString(arr5));
		System.out.println("arr2 :" + Arrays.toString(arr6));
		identicalArray.findIdenticalArrya(arr5, arr6);
	}
}
