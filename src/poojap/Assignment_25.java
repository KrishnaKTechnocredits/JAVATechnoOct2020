/*sum of all numbers from give string.  
String msg = I have 15 years and 2 months of experience.*/

package poojap;

public class Assignment_25 {

	void sumOfDigits(String string) {
		String digit = "";
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (Character.isLetter(ch)) {
				if (digit.length() > 0) {
					sum = sum + Integer.parseInt(digit);
					digit = "";
				}
			}
		}
		if (digit.length() > 0) {
			sum = sum + Integer.parseInt(digit);
		}
		System.out.println("Sum Of Digit is: " + sum);
	}

	public static void main(String[] args) {
		Assignment_25 assignment_25 = new Assignment_25();
		String string = "I have 15 years and 2 months of experience";
		System.out.println("String is: " + string);
		assignment_25.sumOfDigits(string);
	}
}