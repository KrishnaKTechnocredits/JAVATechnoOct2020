package tejashree;

public class Assignment24Program2 {
	/*
	 * program 2 : sum of all numbers in a give string input: te123ch9kj8 output :
	 * 123 + 9 + 8 = 140
	 */

	public int sumOfallDigitsInString(String word) {
		int sum = 0;
		String str = "0";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			// String str=Character.toString(ch);
			if (Character.isDigit(ch)) {
				str = str + ch;
			} else  {
				sum += Integer.parseInt(str);
				str = "0";
			}
		}
		
		return sum+Integer.parseInt(str) ;

	}

	public static void main(String[] args) {
		Assignment24Program2 sumOfDigits = new Assignment24Program2();
		String word = "te123ch9kj8";
		int sum = sumOfDigits.sumOfallDigitsInString(word);
		System.out.println("Sum of all digits in a given string" + "'" + word + "'" + " is: " + sum);

	}

}
