package anjaliS;

public class DuplicateCharacters {
	void integers(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					System.out.println("Not identical elements are : " + array[j]);
			}
		}
	}

	public static void main(String args[]) {
		DuplicateCharacters duplicatecharacters = new DuplicateCharacters();
		int[] arr1 = { 10, 55, 12, 55, 32, 17, 32 };
		duplicatecharacters.integers(arr1);

	}
}
