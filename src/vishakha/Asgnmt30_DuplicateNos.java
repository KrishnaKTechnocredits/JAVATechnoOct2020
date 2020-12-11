package vishakha;

public class Asgnmt30_DuplicateNos {

	public void findDuplicateNos(int[] arr) {
		System.out.print("Duplicate Elements: ");
		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex]) {
					if (index < innerIndex) {
						System.out.print(arr[index]+" ");
						break;
					}
					else if (index > innerIndex)
						break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {10,9,4,7,3,9,10,5,3,5};
		Asgnmt30_DuplicateNos duplicateNumbers = new Asgnmt30_DuplicateNos();
		duplicateNumbers.findDuplicateNos(arr);
	}
}