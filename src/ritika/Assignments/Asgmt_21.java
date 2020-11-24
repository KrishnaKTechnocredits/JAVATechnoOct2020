package ritika.Assignments;
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
public class Asgmt_21 {
	boolean flag = true;
	void checkIdArrayIdenticalOrNot(int[] input1, int[] input2) {
		if (input1.length == input2.length) {
			for (int i=0; i<input1.length; i++) {
				if (input1[i] != input2[i]) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("Identical");
			else
				System.out.println("Not Identical");
		}
		else 
			System.out.println("Not Identical");
	}
	public static void main(String[] args) {
		int [] arr1 = {10,12,55,32,17};
		int [] arr2 = {10,12,55,32,17};
		int [] arr3 = {10,12,55,32,17,99};
		int [] arr4 = {10,12,99,32,17};
		Asgmt_21 asgmt21 = new Asgmt_21();
		System.out.println("arr1 and arr2 are");
		asgmt21.checkIdArrayIdenticalOrNot(arr1, arr2);
		System.out.println("arr1 and arr3 are");
		asgmt21.checkIdArrayIdenticalOrNot(arr1, arr3);
		System.out.println("arr1 and arr4 are");
		asgmt21.checkIdArrayIdenticalOrNot(arr1, arr4);	
	}
}
