/*Assignment 31 :  2nd Dec 2020
Program 1: 
Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"*/

package shrutiS.assignment31;

public class UpperCaseToLowerCase {

	void convertUpperToLower(String input) {
		System.out.print("Output = ");
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch >= 65 && ch <= 90) {
				temp += (char) (ch + 32);
				System.out.print(temp);
				temp = "";
			} else {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		UpperCaseToLowerCase upperLowerCase = new UpperCaseToLowerCase();
		String input = "TechnoCreditS";
		System.out.println("Input  = " + input);
		upperLowerCase.convertUpperToLower(input);
	}
}
