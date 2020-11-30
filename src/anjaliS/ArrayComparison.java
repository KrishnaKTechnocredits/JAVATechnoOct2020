package anjaliS;

public class ArrayComparison {
	public static void main(String args[]) {
		int arr1[] = { 2, 4, 6, 8, 10 };
		int arr2[] = { 2, 4, 6, 9, 10 };
		boolean flag = true;
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] != arr2[index]) {
				flag = false;
				System.out.println("Not Identical");
				return;
			}
			System.out.println("Identical");
		}
	}
}
