package anjaliS;

public class DuplicateNumberFromArray {
	void displaySameNum(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					System.out.println("Duplicate number in array is:" + arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		DuplicateNumberFromArray duplicatefromnumberarray = new DuplicateNumberFromArray();
		int array[] = { 0, 3, 1, 2, 3, 7, 8 };
		duplicatefromnumberarray.displaySameNum(array);

	}

}
