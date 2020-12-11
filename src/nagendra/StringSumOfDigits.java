package nagendra;

/*program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18
*/

public class StringSumOfDigits {

	void getSumOfDigits(String word) {
		int sumOfDigits = 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isDigit(word.charAt(i))) {
				sumOfDigits += Character.getNumericValue(word.charAt(i));
			}
		}
		System.out.println("Sum of Digits in String " + word + " is = " + sumOfDigits);
	}

	public static void main(String[] args) {
		StringSumOfDigits object = new StringSumOfDigits();
		String userInput = "te1ch9kj8";
		object.getSumOfDigits(userInput);
	}
}
