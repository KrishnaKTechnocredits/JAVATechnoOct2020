package sadhana;

/*Assignment - 24 : 22nd Nov'2020 

program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18

 program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140

Raise PR before Monday EOD */
public class SumOfDigits {

	public int printData(String stng) {
		System.out.println("The given string is: " + stng);
		int index = stng.length();
		int sum = 0;
		for (int i = 0; i < index; i++) {
			if (Character.isDigit(stng.charAt(i))) {
				String tmp = stng.substring(i, i + 1);
				sum += Integer.parseInt(tmp);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfDigits sumOfDigits = new SumOfDigits();
		System.out.println("The sum of the digits in the string is: " + sumOfDigits.printData("te1ch9kj8"));
	}
}