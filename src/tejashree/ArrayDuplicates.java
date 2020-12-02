package tejashree;

class ArrayDuplicates {

	void printDupicatesInArray(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[index] == arr[i]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(arr[index]);
			}
		}
	}
	/*void findDuplicate(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++ ) {
				if (input[i] == input[j] ) 
					System.out.println("Dulicate ele are" + input[j]);

				}
			}
		}
*/

	public static void main(String[] args) {
		int[] iArray = { 10, 22, 55, 32, 17, 22, 32 };
		System.out.println("Duplicate elements are:");
		new ArrayDuplicates().printDupicatesInArray(iArray);
	}

}
