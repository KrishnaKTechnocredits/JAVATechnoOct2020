package ruby;

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

public class IdenticalArr {
	void identicalArray(int[] arr1,int[] arr2) {
		boolean flag=false;
		if(arr1.length == arr2.length) {
			for(int index=0;index<arr1.length;index++) {
				if(arr1[index] != arr2[index]) {
					flag=true;
					System.out.println("Arrar1 and Array2 are not identical");
				}	
			}
			if(!flag) {
				System.out.println("Array1 and Array2 are identical");
			}
		}
		else {
			System.out.println("Arrar1 and Array2 are not identical. different length");
		}
			
	}

	public static void main(String[] args) {
		IdenticalArr identicalArr = new IdenticalArr();
		int[] input1 = {10,12,55,32,17};
		int[] input2 = {10,12,55,32,17};
		identicalArr.identicalArray(input1, input2);
		
		int[] arr1 = {10,12,55,32,17,99};
		int[] arr2 = {10,12,55,32,17};
		identicalArr.identicalArray(arr1, arr2);
		 
		 int[] arr3 = {10,12,55,32,17};
		 int[] arr4 = {10,12,99,32,17};
		 identicalArr.identicalArray(arr3, arr4);
	}

}
