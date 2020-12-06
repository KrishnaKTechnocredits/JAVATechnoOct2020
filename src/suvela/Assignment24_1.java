
/*program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140*/
package suvela;

public class Assignment24_1 {
	void getSumOfDigits(String input) {
		int sum = 0;
		String s = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				s += ch;
			else if (s != "") {
				sum += Integer.parseInt(s);
				s = "";
			}
		}
		if (s != "")
			sum = sum + Integer.parseInt(s);
		System.out.println("The sum is:" + sum);
	}

	public static void main(String[] args) {
		Assignment24_1 assign = new Assignment24_1();
		assign.getSumOfDigits("te123ch9kj8");

	}
}
