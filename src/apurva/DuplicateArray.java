package apurva;

public class DuplicateArray {
	void duplicateElement(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					System.out.println("Duplicate Element: " + array[j]);
			}
		}
	}

	public static void main(String[] args) {
		int[] array = new int[] { 10, 12, 55, 32, 17, 12, 32 };
		DuplicateArray duplicatearray = new DuplicateArray();
		duplicatearray.duplicateElement(array);
	}
}