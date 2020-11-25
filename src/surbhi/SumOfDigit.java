package surbhi;
public class SumOfDigit {
	/************
	 * Condition of program1-program 1: sum of all digits from a given string input:
	 * te1ch9kj8 output:= 18
	 ************************/

	public int sumOfDigits(String stng) {
		int l = stng.length();
		int sum = 0;
		for (int i = 0; i < l; i++) {
			if (Character.isDigit(stng.charAt(i))) {
				String tmp = stng.substring(i, i + 1);
				sum += Integer.parseInt(tmp);
			}
		}
		return sum;
	}

	/************
	 * Condition of program2-program 2 : sum of all numbers in a give string input:
	 * te123ch9kj8 output : 123 + 9 + 8 = 140
	 **************/

	public int sumOfTheNumbers(String str) {
		int l = str.length();
		int sum = 0;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				if (i < l - 1 && Character.isDigit(str.charAt(i + 1))) {
					temp += str.charAt(i);
				} else {
					temp += str.charAt(i);
					sum += Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		SumOfDigit sumOfDigit = new SumOfDigit();
		String str1 = "te1ch9kj8";
		System.out.println("The given string is: " + str1);
		System.out.println("The sum of the digits in the string is: " + sumOfDigit.sumOfDigits(str1));
		String str2 = "te123ch9kj8";
		System.out.println("The given string is: " + str2);
		System.out.println("The sum of numbers in the string is: " + sumOfDigit.sumOfTheNumbers(str2));
	}
}
