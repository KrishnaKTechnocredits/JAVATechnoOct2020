package apurva;

/*WAP to find given 2 arrays are identical or not. 
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,55,32,17};
output : Identical
--------------------------------------------
int[] arr1 = {10,12,55,32,17,99};
int[] arr2 = {10,12,55,32,17};
output : Not identical
------------------------------------
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,99,32,17};
output : Not Identical */
public class ArrayComparison {
	boolean flag = true;

	void compareTwoArray(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("Identical");
			else
				System.out.println("Not Identical");
		} else
			System.out.println("Array is not Identical");
	}

	public static void main(String[] args) {
		ArrayComparison arraycomparison = new ArrayComparison();
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		arraycomparison.compareTwoArray(arr1, arr2);
		int[] arr11 = {10,12,55,32,17,99};
		int[] arr21 = {10,12,55,32,17};
		arraycomparison.compareTwoArray(arr11, arr21);
		int[] arr111 = {10,12,55,32,17};
		int[] arr211 = {10,12,99,32,17};
		arraycomparison.compareTwoArray(arr111, arr211);
	}
}
