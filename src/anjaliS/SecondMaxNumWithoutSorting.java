package anjaliS;

public class SecondMaxNumWithoutSorting {
	void MaxSecondNum(int arr[]) {
		int first = 0;
		int second = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				second = arr[i];
			}
		}
		System.out.println("Second highest number is -> " + second);
	}

	public static void main(String[] args) {
		int array[] = { 10, 12, 17, 45, 20, 11 };
		SecondMaxNumWithoutSorting secondmaxnumwithoutsorting = new SecondMaxNumWithoutSorting();
		secondmaxnumwithoutsorting.MaxSecondNum(array);
	}

}
