/*WAP to find given 2 arrays are identical or not.*/
package suvela;

public class Assign21 {
	void findIdenticalArray(int[] array, int[] array2) {
		boolean flag = true;
		if (array.length == array2.length) {
			for (int index = 0; index < array.length; index++) {
				if (array[index] != array2[index]) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("Indentical arrays");
			else
				System.out.println("Non-Indentical arrays");
		} else
			System.out.println("Array length is not same");
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		int[] arr4 = { 10, 12, 55, 32, 17 };
		int[] arr5 = { 10, 12, 55, 32, 17 };
		int[] arr6 = { 10, 12, 99, 32, 17 };
		Assign21 assign = new Assign21();
		assign.findIdenticalArray(arr1, arr2);
		assign.findIdenticalArray(arr3, arr4);
		assign.findIdenticalArray(arr5, arr6);
	}

}
