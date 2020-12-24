/*Assignment_43
 * WAP to sum numbers from below String
 * input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9

hint: Double's parse method
use exception handling
 */

package yogita;

public class SumOfDigitFromString {
	void sumOfNumbers(String array) {
		System.out.println("String is:" + array);
		String[] input = array.split(" ");
		float sum = 0;
		for (int i = 0; i < input.length; i++) {
			char ch = input[i].charAt(0);
			try {
				if (Character.isDigit(ch)) {
					sum += Double.parseDouble(input[i]);
				}
			} catch (NumberFormatException ne) {
				System.out.println("NumberFormatException Occurs");
			}
		}
		System.out.println("\nSum Of Digits From String Is:" + sum);
	}

	public static void main(String[] args) {
		SumOfDigitFromString sumOfDigit = new SumOfDigitFromString();
		String input = "I have 5.6 years of exp in automation and 2.3 in manual testing";
		sumOfDigit.sumOfNumbers(input);
	}
}
