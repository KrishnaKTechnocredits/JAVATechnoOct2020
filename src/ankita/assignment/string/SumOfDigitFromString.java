/*program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18
*/
package ankita.assignment.string;

public class SumOfDigitFromString {
	void getSumOfDigitFromString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println("Input : " + str);
		System.out.println("Sum of Digits : " + sum);
	}

	public static void main(String[] args) {
		String str = "te1ch9kj8";
		SumOfDigitFromString digitFromString = new SumOfDigitFromString();
		digitFromString.getSumOfDigitFromString(str);
	}
}