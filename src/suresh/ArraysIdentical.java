package suresh;

public class ArraysIdentical {
	void identicalCheck(int[] arr1, int[] arr2) {
		boolean flag = true;
		if (arr1.length == arr2.length) {

			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					// System.out.println("Not Identical");
					flag = false;
					break;
				}

			}
		} else {
			flag = false;
		}
		if (flag) {
			System.out.println("Two Arrays Are Equal");
		} else {
			System.out.println("Two Arrays Are Not equal");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		/*//Second set
		int[] arr1 = {10,12,55,32,17,99};
		int[] arr2 = {10,12,55,32,17}};*/
		/* //Third set
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,99,32,17}};*/

		ArraysIdentical arrayidentical = new ArraysIdentical();
		arrayidentical.identicalCheck(arr1, arr2);

	}

}
