package vaibhav;
/*program 1: sum of all digits from a given string
input: te1ch9kj8
output:= 18
*/

public class GetDigitFromString {
	
	void getDigit(String str) {
		int sum = 0;
		for (int index = 0 ; index < str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println("Addition of number from given string is "+sum);
	}

	public static void main(String[] args) {		
		String given="te1ch9kj8";
		GetDigitFromString getDigitFromString = new GetDigitFromString();
		getDigitFromString.getDigit(given);
	}
}
