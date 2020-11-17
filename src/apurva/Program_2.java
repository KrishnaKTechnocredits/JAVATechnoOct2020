package apurva;

//String input = "hmPZ23i9Ws", output = "239PZWhmis";
public class Program_2 {
	void swapChar(String word) {
		System.out.println(" Given word: " + word);
		String digit = "", capital = "", small = "", specialChar = "";
		for (int index = 0; index < word.length(); index++) {
			char character = word.charAt(index);
			if (Character.isDigit(character))
				digit = digit + character;
			else if (Character.isUpperCase(character))
				capital = capital + character;
			else if (Character.isLowerCase(character))
				small = small + character;
			else
				specialChar += character;
		}
		System.out.println("Swap Character:" + digit + capital + small + specialChar);
	}

	public static void main(String[] args) {
		Program_2 program_2 = new Program_2();
		program_2.swapChar("hmPZ23i9Ws");
	}
}