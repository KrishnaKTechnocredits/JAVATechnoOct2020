package rohan;

import anjaliP.Array;

/*WAP to find given 2 arrays are identical or not. 
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

public class ArrayIdentical {

	void arrayIdentical(int[] numArr1, int[] numArr2) {
		boolean flag = true;
		if(numArr1.length == numArr2.length) {
			for(int index=0;index<numArr1.length;index++) {
				if(numArr1[index]!=numArr2[index]) {
					System.out.println("Arrays are not identical");
					flag = false;
					break;
				}
			}
				if(flag)
					System.out.println("Arrays are identical");
		}else
			System.out.println("Arrays are not identical");
	}
	
	public static void main(String[] args) {
		ArrayIdentical arr = new ArrayIdentical();
		int numArr1[] = {10,20,30,40};
		int numArr2[] = {10,20,20,40};
		arr.arrayIdentical(numArr1, numArr2);
	}
}
