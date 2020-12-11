/* program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140*/

package poojap;

public class SumOfDigit {

	void sumOfTheNumbers() {
		String string = "te123ch9kj8 ";
		String digit = "";
		int sum = 0;

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isDigit(ch)) {
				char ch1 = string.charAt(i + 1);
				if (i < string.length() && Character.isDigit(ch1)) {
					digit = digit + ch;
				} else {
					digit = digit + ch;
					System.out.print(" " + digit);
					sum = sum + Integer.parseInt(digit);
					digit = "";
				}
			}
		}
		System.out.println(" " + digit);
		System.out.println("Sum of Digit is: " + sum);
	}

	public static void main(String[] args) {
		System.out.println("Digit In The String Is :  ");
		SumOfDigit sumOfDigit = new SumOfDigit();
		sumOfDigit.sumOfTheNumbers();
	}
}