//Assignment 21 : 17th Nov'2020  
// WAP to find given 2 arrays are identical or not. 
//int[] arr1 = {10,12,55,32,17};
//int[] arr2 = {10,12,55,32,17}};
//output : Identical
//--------------------------------------------
//int[] arr1 = {10,12,55,32,17,99};
//int[] arr2 = {10,12,55,32,17}};
//output : Not identical
//------------------------------------
//int[] arr1 = {10,12,55,32,17};
//int[] arr2 = {10,12,99,32,17}};
//output : Not Identical

package priya;

public class ArraysIdenticalOrNot {

	boolean flag = true;

	void identicalOrNot(int[] arr1,int[] arr2) {
		if (arr1.length == arr2.length) {
			for (int i=0;i<arr1.length;i++) {
				if(arr1[i] != arr2[i]) {
					flag=false;
					break;
				}
			}
			if (flag)
				System.out.println("Array is Identical");
			else
				System.out.println("Array is not Identical");
		}
		else
			System.out.println("Array is not Identical");
		}
public static void main(String[] args) {
	ArraysIdenticalOrNot identicalornot = new ArraysIdenticalOrNot();
	int[] arr1={10,12,55,32,17};
	int[] arr2={10,12,55,32,17};
	identicalornot.identicalOrNot(arr1, arr2);
	int[] arr3 = {10,12,55,32,17,99};
	int[] arr4 = {10,12,55,32,17};
	identicalornot.identicalOrNot(arr3, arr4);
	int[] arr5 = {10,12,55,32,17};
	int[] arr6 = {10,12,99,32,17};
	identicalornot.identicalOrNot(arr5, arr6);
}
}
