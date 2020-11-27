package apurva;

public class DuplicateArray1 {
	void duplicateArray(String[] string) {
		for (int i = 0; i < string.length; i++) {
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j])
					System.out.println("Duplicate Element: " + string[j]);
			}
		}
	}

	public static void main(String[] args) {
		String[] array = new String[] { "Techno", "Credits", "Techno", "Hi", "Hello", "Hi" };
		DuplicateArray1 duplicatearray1 = new DuplicateArray1();
		duplicatearray1.duplicateArray(array);
	}
}