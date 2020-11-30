/*
 * Assignment 21: Identical & Non-Identical array checking.
 * Example: 
 * {10,12,55,32,17} , {10,12,55,32,17} -- Identical
 * {10,12,55,32,17} , {10,12,99,32,17} -- Non Identical
 */
package ankit.arrayConcepts;

public class IdenticalNonIdentical {

		void findIdenticalArray(int[] array, int[] array2) {
			boolean flag = false;
			if (array.length == array2.length) {
				for (int index = 0; index < array.length; index++) {
					if (array[index] != array2[index]) {
						flag = true;
						break;
					}
				}
				if (!flag)
					System.out.println("Given array is Indentical");
				else
					System.out.println("Provided array is Non-Indentical");
			} else
				System.out.println("Length of provided array is not same");
		}

		public static void main(String[] args) {
			int[] arr1 = { 10, 12, 55, 32, 17 };
			int[] arr2 = { 10, 12, 55, 32, 17 };
			int[] arr3 = { 10, 12, 55, 32, 17, 99 };
			int[] arr4 = { 10, 12, 55, 32, 17 };
			int[] arr5 = { 10, 12, 55, 32, 17 };
			int[] arr6 = { 10, 12, 99, 32, 17 };
			IdenticalNonIdentical identicalNonIdentical = new IdenticalNonIdentical();
			identicalNonIdentical.findIdenticalArray(arr1, arr2);
			identicalNonIdentical.findIdenticalArray(arr3, arr4);
			identicalNonIdentical.findIdenticalArray(arr5, arr6);
		}
}
