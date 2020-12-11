/*Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"*/

package poojap;

public class SumOfAscii {
	void SumOfNumber(String string) {
		String temp = "";
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			int ans = ch;
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
			if (ans >= 65 && ans <= 90) {
				char ch1 = (char) (ch + 32);
				temp = temp + ch1;
			}
			if (ans >= 97 && ans <= 122) {
				char ch1 = (char) (ch - 32);
				temp = temp + ch1;
			}
		}
		System.out.println("After Conversion : " + sum + temp);
	}

	public static void main(String[] args) {
		SumOfAscii sumOfAscii = new SumOfAscii();
		String string = "Te1ch8n9oC6reDi5TS1";
		System.out.println("Given String Is : " + string);
		sumOfAscii.SumOfNumber(string);
	}
}
