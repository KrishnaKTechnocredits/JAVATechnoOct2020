package shrutiC;

public class Program3 {

	// Method which take one character and return its ascii value.
	int getAsciiValue(char ch) {
		int asciiValue = 0;
		return asciiValue = (int) ch;
	}

	// Method which take one ascii and return character
	char getChar(int asciiValue) {
		char ch = ' ';
		return ch = (char) asciiValue;
	}

	// write a method to print ascii values for uppercase letters [A-Z].
	// A -> 65, B - 66....
	void printASCIIValueOfUpperCaseChar() {
		for (int i = 65; i <= 90; i++) {
			System.out.println(getChar(i) + " -> " + i);
		}
	}

	// write a method to print ascii values for lowercase letter [a-z].
	// a -> 97, b -> 98
	void printASCIIValueOfLowerCaseChar() {
		for (int i = 97; i <= 122; i++) {
			System.out.println(getChar(i) + " -> " + i);
		}
	}

	public static void main(String[] args) {

		Program3 object = new Program3();

		System.out.println("ASCII value of A - " + object.getAsciiValue('A') + "\n");
		System.out.println("Char having ASCII value 66 - " + object.getChar(66) + "\n");

		System.out.println("ASCII values of lowercase letters : ");
		object.printASCIIValueOfLowerCaseChar();

		System.out.println("\nASCII values of Upercase letters : ");
		object.printASCIIValueOfUpperCaseChar();
	}

}
