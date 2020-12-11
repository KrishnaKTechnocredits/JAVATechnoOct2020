package anjaliS;

public class PrintAsciiValue {
	void displayAsciiValueOfCharacter(char ch) {
		int asciivalue = ch;
		System.out.println("Ascii value of " + ch + " is : " + asciivalue);

	}

	void displayCharacterFromAsciiValue(int asciivalue) {
		char ch = (char) asciivalue;
		System.out.println("Character of " + asciivalue + " is : " + ch);

	}

	void displayAsciiValuesOfUpperCaseLetters() {
		int ch1 = ' ';
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			ch1 = ch;
			System.out.println("Ascii value of " + ch + " is : " +ch1);
		}
	}

	void displayAsciiValuesOfLowerCaseLetters() {
		int ch2 = ' ';
		for (char ch = 'a'; ch <= 'z'; ch++) {
			ch2 = ch;

			System.out.println("Ascii value of " + ch + " is : " + ch2);
		}
	}

	public static void main(String[] args) {
		PrintAsciiValue printasciivalue = new PrintAsciiValue();
		printasciivalue.displayAsciiValueOfCharacter('A');
		printasciivalue.displayCharacterFromAsciiValue(65);
		printasciivalue.displayAsciiValuesOfUpperCaseLetters();
		printasciivalue.displayAsciiValuesOfLowerCaseLetters();
	}

}
