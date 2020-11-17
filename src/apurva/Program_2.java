package apurva;

/*Reverse given string array.
 *input: {"Credits ", "Techno ", "From ", "Diwali ", "Happy "}
 output: {"Happy", "Diwali", "From", "Techno", "Credits"} /
public class Program_2 {
	void reverseArray(String[] string) {
		for (int index = string.length - 1; index >= 0; index--) {
			System.out.print(string[index]);
		}
	}

	public static void main(String[] args) {
		String[] words = {"Credits ", "Techno ", "From ", "Diwali ", "Happy "};
		new Program_2().reverseArray(words);
	}
}