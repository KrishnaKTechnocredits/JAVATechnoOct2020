/* WAP to find given 2 arrays are identical or not. 
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



package anurag;

public class Identical {

	void display(int arr1[], int arr2[]) {
		int count = 0;
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[index] == arr2[j])
						count++;
				}
			}

			if (count == arr1.length)
				System.out.println("Identical Arrary");
			else
				System.out.println("Not Identical");
		} else
			System.out.println("Array Length does not match, so Not Identical");
	}

	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 90 };
		int arr2[] = { 10, 20, 30, 40, 60, 90 };
		Identical identical = new Identical();
		identical.display(arr1, arr2);
	}

}
