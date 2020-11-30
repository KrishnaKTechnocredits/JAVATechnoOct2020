/*program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18*/

package yogita;

public class FindSumOfDigitFromString {
	void sumOfDigit(String name) {
		String digit = "";
		System.out.println("String is:" + name);
		int sum = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			boolean flag = false;
			if (Character.isDigit(ch)) {
				flag = true;
			}
			if (flag) {
				digit = digit + Character.toString(ch);
				System.out.print(" " + digit);
				digit = "";
				sum += Character.getNumericValue(ch);

			}
		}

		System.out.println("\nSum of Digit from String is:" + sum);
	}

	public static void main(String[] args) {
		FindSumOfDigitFromString digitSum = new FindSumOfDigitFromString();
		String name = " te1ch9kj8";
		digitSum.sumOfDigit(name);
	}
}
