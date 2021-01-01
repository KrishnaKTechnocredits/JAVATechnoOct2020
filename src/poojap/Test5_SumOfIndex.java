package poojap;

public class Test5_SumOfIndex implements Manager {

	public int[] findTargetIndex(int[] array, int target) {
		int[] result = new int[2];
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int sum = array[i] + array[j];
				if (sum == 9) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Manager manager = new Test5_SumOfIndex();
		int[] array = { 10, 3, 5, 2, 9, 7, 8 };
		int target = 9;
		int[] arr1 = manager.findTargetIndex(array, target);
		System.out.println("first index -> " + arr1[0]); 
		System.out.println("second index -> " + arr1[1]); 
	}
}
