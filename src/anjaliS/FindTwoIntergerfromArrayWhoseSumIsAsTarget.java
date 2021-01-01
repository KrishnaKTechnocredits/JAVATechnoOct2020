package anjaliS;

public class FindTwoIntergerfromArrayWhoseSumIsAsTarget implements IntegerArrayAndTargetValue {
	public int[] findTargetIndex(int[] array, int result) {
		int[] newArray = new int[2];
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == result) {
					newArray[0] = i;
					newArray[1] = j;

				}
			}

		}
		return newArray;

	}

	public static void main(String[] args) {
		FindTwoIntergerfromArrayWhoseSumIsAsTarget IntegerArrayAndTargetValue = new FindTwoIntergerfromArrayWhoseSumIsAsTarget();
		int arr[] = { 10, 3, 5, 2, 9, 7, 8 };
		int target = 8;
		int[] arr1 = IntegerArrayAndTargetValue.findTargetIndex(arr, target);
		System.out.println("Index of first number is: " + arr1[0]);
		System.out.println("Index of second number is: " + arr1[1]);
	}
}
