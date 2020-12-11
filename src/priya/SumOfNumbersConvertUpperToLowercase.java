//Program 2: Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
//Given String = "Te1ch8n9oC6reDi5TS1"
//Expected String = "30tECHNOcREdIts"

package priya;

public class SumOfNumbersConvertUpperToLowercase {

	int sum = 0;
	String s = "";
	char ch;
	int total;

	int sumOfNumbers(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	String convertUpperToLowercaseLetters(String word) {
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
		SumOfNumbersConvertUpperToLowercase sumofnumbersconvertuppertolowercase = new SumOfNumbersConvertUpperToLowercase();
		String s = "143technocredits";
		System.out.println("String is : " + s);
		System.out.print("Conversion of string is " + sumofnumbersconvertuppertolowercase.sumOfNumbers(s) + ""
				+ sumofnumbersconvertuppertolowercase.convertUpperToLowercaseLetters(s));

	}
}
