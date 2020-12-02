package prem;

public class Identical {

/*
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

	boolean isIdential(int[] numberArr1, int numberArr2[]) {
		if(numberArr1.length == numberArr2.length) {
			for(int index=0; index<numberArr1.length; index++) {
				if(numberArr1[index]!=numberArr2[index])
					return false;
			}
		}else
			return false;
		return true;
	}

	public static void main(String[] args) {
		int[] numberArr1 = {1,3,6,8,9};
		int[] numberArr2 = {1,3,6,8,9};
		System.out.println("Are arrays identical: "+new Identical().isIdential(numberArr1, numberArr2));
	}
}
