package anjaliS;

public class PrintSameNumberFromArray {
	void displaySameNum(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr2[j] == arr1[i])
					System.out.println(+arr1[i]);
			}
		}
	}

	public static void main(String[] args) {
		int array1[] = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int array2[] = { 1, 0, 6, 15, 6, 4, 7, 0 };
		PrintSameNumberFromArray printsamenumberfromArray = new PrintSameNumberFromArray();
		printsamenumberfromArray.displaySameNum(array1, array2);

	}

}
