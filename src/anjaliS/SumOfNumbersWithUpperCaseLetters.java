package anjaliS;

public class SumOfNumbersWithUpperCaseLetters {
	int sum = 0;
	String s = "";
	char ch;
	int total;

	int displaySumNum(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;

	}

	String displayUppercaseLetters(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (ch >= 97 && ch <= 122) {
				ch = (char) (ch - 32);
				s += ch;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		SumOfNumbersWithUpperCaseLetters sumofnumberswithuppercaseletters = new SumOfNumbersWithUpperCaseLetters();
		String s = "143technocredits";
		System.out.println("String is : " + s);
		System.out.print("Conversion of string is " + sumofnumberswithuppercaseletters.displaySumNum(s) + ""
				+ sumofnumberswithuppercaseletters.displayUppercaseLetters(s));

	}
}