package milind;

public class SumOfDigitFromString {
	
	void digitSumString(String input) {
		int digitSum = 0;
		for(int index = 0; index < input.length(); index++) {
			if(Character.isDigit(input.charAt(index))) {
				int numberFromString = Character.getNumericValue(input.charAt(index));
				digitSum = digitSum + numberFromString;
			}
		}
		System.out.println("Sum of digit from string is : " + digitSum);
	}
	
	public static void main(String[] args) {
		String input = "te1ch9kj8";
		SumOfDigitFromString sumOfDigitFromString = new SumOfDigitFromString();
		sumOfDigitFromString.digitSumString(input);
	}

}
