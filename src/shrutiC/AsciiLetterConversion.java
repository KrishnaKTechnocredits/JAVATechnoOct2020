package shrutiC;

public class AsciiLetterConversion {

	void covertStringCase(String string) {
		String convertedString = "";
		int asciiValue = 0;
		char ch = ' ';
		System.out.println("Covert lower case char to uppercase and vice versa");
		System.out.println("Input  : " + string);
		for (int i = 0; i < string.length(); i++) {
			ch = string.charAt(i);
			asciiValue = (int) ch;
			ch = getConvertedChar(asciiValue);
			convertedString += "" + ch;
		}
		System.out.println("Output : " + convertedString);
	}

	char getConvertedChar(int asciiValue) {
		char ch = ' ';
		if (asciiValue > 64 && asciiValue < 91) {// Uppercase char
			ch = (char) (asciiValue + 32);
		} else if (asciiValue > 96 && asciiValue < 123) {// lowercaseChar
			ch = (char) (asciiValue - 32);
		}
		return ch;
	}

	void addDigits(String string) {

		String convertedString = "";
		int asciiValue = 0, sum = 0;

		System.out.println("Sum all digits and Covert lower case char to uppercase and vice versa");
		System.out.println("Input  : " + string);
		
		for (int i = 0; i < string.length(); i++) {
			asciiValue = (int) string.charAt(i);
			if (Character.isLetter(string.charAt(i))) {
				convertedString += getConvertedChar(asciiValue);
			} else if (asciiValue > 47 && asciiValue < 58) {
				sum += Character.getNumericValue(string.charAt(i));
			}

		}
		convertedString = sum + convertedString;
		System.out.println("Output : " + convertedString);

	}

	public static void main(String[] args) {

		AsciiLetterConversion object = new AsciiLetterConversion();
		object.covertStringCase("TechnoCreditS");
		System.out.println("-----------------------------------------------------------------------");
		object.addDigits("Te1ch8n9oC6reDi5TS1");
	}

}
