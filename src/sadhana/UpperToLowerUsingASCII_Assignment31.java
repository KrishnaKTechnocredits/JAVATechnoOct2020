/*Assignment 31 
Program 1: 
Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"*/

package sadhana;

public class UpperToLowerUsingASCII_Assignment31 {
	void processData(String str) {
		int i, n;
		String z = "";
		z = "";
		char c;
		for (i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c >= 65 && c <= 90) {
				n = c + 32;
				c = (char) n;
			}
			z = z + c;
		}
		System.out.println("Lower Case string: " + z);

	}

	public static void main(String[] args) {

		String str = "TechnoCreditS";
		System.out.println("Given string: " + str);
		UpperToLowerUsingASCII_Assignment31 upperToLower = new UpperToLowerUsingASCII_Assignment31();
		upperToLower.processData(str);

	}
}
