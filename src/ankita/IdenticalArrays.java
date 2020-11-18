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
output : Not Identical
*/
package ankita;

import java.util.Arrays;

public class IdenticalArrays {
	
	void isIdentical(int[] arr1, int[] arr2) {
		System.out.println("Array1" + Arrays.toString(arr1));
		System.out.println("Array2" + Arrays.toString(arr2));
		boolean flag=true;
		if(arr1.length == arr2.length)
		{
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					flag=false;
					break;
				}
			}
			if(!flag)
				System.out.println("Not Identical..Content mismatch");
			else
				System.out.println("Identical");
		}
		else
			System.out.println("Not Identical..Length mismatch");
	}
	public static void main(String[] args) {
		IdenticalArrays arrays = new IdenticalArrays();
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		arrays.isIdentical(arr1,arr2);
		
		int[] arr3 = {10,12,55,32,17,99};
		int[] arr4 = {10,12,55,32,17};
		arrays.isIdentical(arr3,arr4);
		
		int[] arr5 = {10,12,55,32,17};
		int[] arr6 = {10,12,99,32,17};
		arrays.isIdentical(arr5,arr6);
	}
}