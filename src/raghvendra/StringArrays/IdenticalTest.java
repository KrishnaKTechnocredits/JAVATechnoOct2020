package raghvendra.StringArrays;
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
output : Not Identica*/

public class IdenticalTest {
	void identicalArray(int[] arr, int[] arr2) {
		boolean flag=false;
			if(arr.length!=arr2.length)
				System.out.println("Arrays are not Identical");
			else { 
				for(int index=0;index<arr2.length;index++) {
					if(arr[index]!=arr2[index]) {
						flag=true;
						break;
					}
				 }
				if(flag)
					System.out.println("Arrays are not Identical");
				else
					System.out.println("Arrays are Identical");
			}
		}

	public static void main(String[] args) {
		IdenticalTest identicalTest=new IdenticalTest();
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		identicalTest.identicalArray(arr1, arr2);
		int[] arr3 = {10,12,55,32,17,99};
		int[] arr4 = {10,12,55,32,17};
		identicalTest.identicalArray(arr3, arr4);
		int[] arr5 = {10,12,55,32,17};
		int[] arr6 = {10,12,99,32,17};
		identicalTest.identicalArray(arr5, arr6);
	}
}
