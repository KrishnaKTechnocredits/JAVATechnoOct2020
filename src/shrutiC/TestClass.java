package shrutiC;

public class TestClass implements Manager {

	public int[] findTargetIndex(int[] arr, int target) {
		int array[] = new int[2];

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == target) {
					array[0] = i;
					array[1] = j;
					break;
				}
			}
		}

		return array;
	}

	public static void main(String[] args) {

		Manager manager = new TestClass();
		int[] arr = { 10, 3, 5, 2, 9, 7, 8 };
		int target = 9;
		int[] arr1 = manager.findTargetIndex(arr, target);
		System.out.println("first index -> " + arr1[0]); // 3
		System.out.println("second index -> " + arr1[1]); // 5
	}

}
