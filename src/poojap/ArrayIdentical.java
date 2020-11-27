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

package poojap;

public class ArrayIdentical {

	void arrayIdentical() {
		boolean flag = true;
		int[] arr1 = { 20, 45, 15, 32, 17 };
		int[] arr2 = { 20, 45, 15, 32, 17,63 };

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] != arr2[j]) {
						flag = false;
						break;
					}
				}
			}
			if (!flag)
				System.out.println("Array is Identical");
			else
				System.out.println("Array is Not Identical");
		} else
			System.out.println("Array is Not Identical");
	}

	public static void main(String[] args) {
		ArrayIdentical arrayIdentical = new ArrayIdentical();
		arrayIdentical.arrayIdentical();
	}
}
