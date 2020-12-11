package monika;
/*

 Assignment 21 : 17th Nov'2020  
 
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
output : Not Identical
*/

import java.util.Arrays;

class ArrayIdentical {

	void findIdenticalArray(int[] arr1, int[] arr2) {

		System.out.println("Array1:" + Arrays.toString(arr1));
		System.out.println("Array2:" + Arrays.toString(arr2));

		boolean flag = false;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					flag = true;
					break;
				}
			}

			if (flag)
				System.out.println("Arrays Are Not Identical:Mismatch Contents");

			else

				System.out.println("Arrays Are Identical:Length and also Contents Matches");

		} else
			System.out.println("Arrays Are not identical: Mismatch Length");

	}

	public static void main(String[] rags) {
		ArrayIdentical arrayidentical = new ArrayIdentical();
		int[] array1 = { 10, 12, 55, 32, 17 };
		int[] array2 = { 10, 12, 55, 32, 17 };
		arrayidentical.findIdenticalArray(array1, array2);

	}
} 
