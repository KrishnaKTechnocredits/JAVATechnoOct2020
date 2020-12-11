package anjaliP;
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
public class ArrayIdentical {
	
	void verifyIdenticalArray(int[] array1, int[] array2) {
		boolean flag = true;
		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] == array2[i])
					continue;
				else
					flag = false;
			}
			if (flag)
				System.out.println("Identical");
			else
				System.out.println("Not Identical");
		}
	}
	public static void main(String[] args) {
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		ArrayIdentical duplicatearray = new ArrayIdentical();
		duplicatearray.verifyIdenticalArray(arr1, arr2);
	}
} 
