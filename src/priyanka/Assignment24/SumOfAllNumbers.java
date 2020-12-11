package priyanka.Assignment24;

/*program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140
*/

public class SumOfAllNumbers {

	void sumDigitsInString(String str) {
		String temp = "";
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
			else if (temp != "") {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		sum = sum + Integer.parseInt(temp);
		System.out.println("Sum of numbers in string is:" + sum);
	}

	public static void main(String[] args) {
		SumOfAllNumbers sumOfAllNumbers = new SumOfAllNumbers();
		String str = "te123ch9kj8dh5";
		System.out.println("The Given string is:" + str);
		sumOfAllNumbers.sumDigitsInString(str);
	}

}
