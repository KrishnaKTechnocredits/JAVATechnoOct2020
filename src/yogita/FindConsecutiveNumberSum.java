/*
 Program 1: sum of all numbers from give string.  

 String msg = I have 15 years and 2 months of experience.

 */
package yogita;

public class FindConsecutiveNumberSum {

	void sumOfConsecutiveNumber(String name) {
		System.out.println("String is:" + name);

		int sum = 0;
		String digit = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (digit.length() > 0) {
				sum += Integer.parseInt(digit);
				System.out.println(digit + "");
				digit = "";
			}
		}
		if (digit.length() > 0) {
			sum += Integer.parseInt(digit);

		}
		System.out.println("Sum Of Consecutive Numbers From String is: " + sum);
	}

	public static void main(String[] args) {
		FindConsecutiveNumberSum consecutiveNumberSum = new FindConsecutiveNumberSum();
		consecutiveNumberSum.sumOfConsecutiveNumber("I have 15 years and 2 months Expierence.");

	}

}
