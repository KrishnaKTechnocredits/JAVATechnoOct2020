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

package kajol;
import java.util.Arrays;

public class FindIdenticalArrays {
	
	boolean areArraysIdentical(int[]inputArray1, int[] inputArray2) {
		if(inputArray1.length==inputArray2.length) {
			for(int index=0;index<inputArray1.length;index++) {
				if(inputArray1[index]==inputArray2[index])
					continue;
				else
				return false;
			}return true;		
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] inputArray1={10,12,55,32,17};
		int[] inputArray2={10,12,99,32,17};
		System.out.println("Array1: "+Arrays.toString(inputArray1));
		System.out.println("Array2: "+Arrays.toString(inputArray2));
		//boolean flag=new FindIdenticalArrays().areArraysIdentical(inputArray1, inputArray2);
		if(new FindIdenticalArrays().areArraysIdentical(inputArray1, inputArray2))
			System.out.println("Arrays are Identical");	
		else
			System.out.println("Arrays are not Identical");		
	}	
}
