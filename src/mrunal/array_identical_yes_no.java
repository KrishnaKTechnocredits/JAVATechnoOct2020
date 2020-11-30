package mrunal;
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

public class array_identical_yes_no {

	void displayArray(int[] array1, int[] array2) 
	{
		boolean flag = false;
		if (array1.length == array2.length) 
		{
			for (int index = 0; index < array1.length; index++)
			{
				if (array1[index] != array2[index]) 
				{
					flag = true;
					break;
				}
			}
			
			if (!flag)
				System.out.println("----identical");
			else
				System.out.println("-- Non-Indentical");
		}
		else
			System.out.println("---not identical");
	}
public static void main(String[] args) 
{
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		int[] arr4 = { 10, 12, 55, 32, 17 };
		int[] arr5 = { 10, 12, 55, 32, 17 };
		int[] arr6 = { 10, 12, 99, 32, 17 };
		
		array_identical_yes_no  i = new array_identical_yes_no ();
		
		System.out.println("displaying whether array1 and array2 are identical or not ");
		i.displayArray(arr1, arr2);
		
		System.out.println("displaying whether array3 and array4 are identical or not ");
		i.displayArray(arr3, arr4);
		
		System.out.println("displaying whether array5 and array6 are identical or not ");
		i.displayArray(arr5, arr6);
	}
}