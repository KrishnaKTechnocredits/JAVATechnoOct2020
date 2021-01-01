package brijesh.codingexams.exam5;

public class TestClass implements Manager {

	@Override
	public int[] findTargetIndex(int[] arr, int target) {
		int[] result = new int[2];
		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = index; innerIndex < arr.length; innerIndex++) {
				if(arr[index]+arr[innerIndex]==target) {
					result[0]=index;
					result[1]=innerIndex;
					return result;
				}
			}
		}
		return result;
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
