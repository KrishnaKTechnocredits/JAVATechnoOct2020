package nagendra;

public class IdenticalArray {

	void verifyIdenticalArray(int[] array1, int[] array2) {
		boolean flag = true;
		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] == array2[i])
					continue;
				else
					flag = false;
			}
			if (flag)
				System.out.println("Identical");
			else
				System.out.println("Not Identical");

		} else
			System.out.println("Not Identical :Array size does not match");
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		IdenticalArray duplicatearray = new IdenticalArray();
		duplicatearray.verifyIdenticalArray(arr1, arr2);
	}
}