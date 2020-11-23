package apurva;

/*sum of all digits from a given string  
input: te1ch9kj8 
output:= 18*/
public class Program_1 {
	void sumOfDigitFromString(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("String Input: " + input);
		System.out.println("Sum of Digits: " + sum);
	}

	public static void main(String[] args) {
		new Program_1().sumOfDigitFromString("te1ch9kj8");
	}
}