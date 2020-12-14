package suvela.exams.exam5;

public class TestClass implements Manager {
	public int[] findTargetIndex(int[] arr, int target) {
		int[] arr1 = new int[arr.length];
		int num = 0, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			num = arr[i];
			for (int j = 0; j < arr.length; j++) {
				sum = num + arr[j];
				if (target == sum) {
					arr1[0] = j;
					arr1[1] = i;
				}
			}

		}
		return arr1;
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
