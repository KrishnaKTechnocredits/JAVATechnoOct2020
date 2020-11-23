package priyanka.Assignment24;

/*program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140
*/

public class SumOfAllNumbers {

	void getSumOfAllNumbers(String str) {

		String temp = "0";
		int sum = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + str.charAt(index);
			} else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
			if (index == str.length() - 1 && temp != "")
				sum = sum + Integer.parseInt(temp);
		}
		System.out.println("The sum of all numbers in a give string " + sum);
	}

	public static void main(String[] arg) {
		SumOfAllNumbers sumOfAllNumbers = new SumOfAllNumbers();
		String str = "te123ch9kj8";
		System.out.println("The sum of all numbers in a give string " + str);
		sumOfAllNumbers.getSumOfAllNumbers(str);
	}

}
