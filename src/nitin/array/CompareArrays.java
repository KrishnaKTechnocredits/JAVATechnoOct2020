package nitin.array;

import java.util.Arrays;

/*Assignment 21 : 17th Nov'2020 - WAP to find given 2 arrays are identical or not. 
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
output : Not Identical */
public class CompareArrays {
	boolean flag=true;
	public void arrayCompare(int[] arr1,int[] arr2) {
		if(arr1.length==arr2.length) {
			for(int index=0;index<arr1.length;index++) {
				if(arr1[index]!=arr2[index]) {
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println("Above Arrays are Identical.");
			else
				System.out.println("Above Arrays are not Identical.");	
		}
		else
			System.out.println("Above Arrays are not Identical.");
	}
	public static void main(String[] args) {
		int[] arr1 = {10,12,55,32,11,15};
		System.out.println("Array 1 : "+Arrays.toString(arr1));
		int[] arr2 = {10,12,55,32,11};
		System.out.println("Array 2 : "+Arrays.toString(arr2));
		new CompareArrays().arrayCompare(arr1, arr2);
	}
}
