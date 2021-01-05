/*Assignment : 43 

WAP to sum numbers from below String

input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9

hint: Double's parse method
use exception handling*/

package shrutiS.assignment43;

public class SumOfNumberFromString {
	void sumOfNumbersFromString(String string) {
		System.out.println("Given String: " + string);
		String[] temp = string.split(" ");
		double sum = 0;
		for (String value : temp) {
			try {
				double number = Double.parseDouble(value);
				sum += number;
			} catch (NumberFormatException numberFormat) {
				continue;
			}
		}
		System.out.println("Sum of all the numbers: " + String.format("%.2f", sum));
	}

	public static void main(String[] args) {
		SumOfNumberFromString numbersFromString = new SumOfNumberFromString();
		numbersFromString.sumOfNumbersFromString("I have 5.6 years of exp in automation and 2.3 in manual testing");
	}
}
