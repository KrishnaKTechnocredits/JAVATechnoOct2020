package rohit;
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
output : Not Identical*/
public class Arrays {

	void identicalarray(int[] array, int[] array2) {
		boolean flag = false;
		if (array.length == array2.length) {
			for (int index = 0; index < array.length; index++) {
				if (array[index] != array2[index]) {
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.println("Provided array is Indentical");
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
		Arrays arrays = new Arrays();
		arrays.identicalarray(arr1, arr2);
		arrays.identicalarray(arr3, arr4);
		arrays.identicalarray(arr5, arr6);
	}
}
