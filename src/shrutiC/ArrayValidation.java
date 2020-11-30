package shrutiC;

/*WAP to find given 2 arrays are identical or not. 
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
public class ArrayValidation {

	boolean isArrayIdentical(int[] array1, int[] array2) {

		if (array1.length == array2.length) {
			for (int index = 0; index < array1.length; index++) {
				if (array1[index] != array2[index])
					return false;
			}
			return true;
		} else
			return false;
	}

	void displayArrayValidation(int[] array1, int[] array2) {
		if (isArrayIdentical(array1, array2))
			System.out.println("Given Arrays are identical");
		else
			System.out.println("Given Arrays are not identical");
	}

	public static void main(String[] args) {

		ArrayValidation object = new ArrayValidation();

		int[] array1 = { 10, 12, 55, 32, 17 };
		int[] array2 = { 10, 12, 55, 32, 17 };
		object.displayArrayValidation(array1, array2);

		int[] array3 = { 10, 12, 55, 32, 17, 99 };
		int[] array4 = { 10, 12, 55, 32, 17 };
		object.displayArrayValidation(array3, array4);

		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 99, 32, 17 };
		object.displayArrayValidation(arr1, arr2);
	}

}
