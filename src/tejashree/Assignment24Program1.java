/*program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18*/
package tejashree;

public class Assignment24Program1 {

	public int sumOfallDigitsInString(String word) {
		int sumOfDigits = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isDigit(ch)) {
				sumOfDigits += Character.getNumericValue(ch);
			}
		}
		return sumOfDigits;
	}
	public static void main(String[] args) {
		Assignment24Program1 sumOfDigits = new Assignment24Program1();
		String word = "te1ch9kj8";
		int sum = sumOfDigits.sumOfallDigitsInString(word);
		System.out.println("Sm of all digits in a given string" + "'" + word + "'" + " is: " + sum);
	}
}
