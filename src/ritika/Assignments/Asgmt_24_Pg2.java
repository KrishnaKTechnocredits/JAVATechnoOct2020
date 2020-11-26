package ritika.Assignments;

/*Assignment - 24 : 22nd Nov'2020

program 2 : sum of all numbers in a give string
input: te123ch9kj8
output : 123 + 9 + 8 = 140
*/
public class Asgmt_24_Pg2 {

	void sumOfNumbersFromString(String input) {
		int sum = 0;
		String temp = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch))
				temp = temp + ch;
			else if (Character.isLetter(ch)) {
				if (temp.length() > 0) {
					sum = sum + Integer.parseInt(temp);
				}
				temp = "";
			}
		}
		if (temp.length() > 0) {
			sum = sum + Integer.parseInt(temp);
		}
		System.out.println("Sum of all numbers in given string is: " + sum);
	}

	public static void main(String[] args) {
		String input = "te123ch9kj8";
		Asgmt_24_Pg2 stringOperations = new Asgmt_24_Pg2();
		stringOperations.sumOfNumbersFromString(input);
	}
}
