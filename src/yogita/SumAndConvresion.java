/*
Program 2:
Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"

*/

package yogita;

public class SumAndConvresion {

	int sum = 0;
	String temp = "";
	char ch1;

	int sumOfNumberFromString(String name) {
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	String upperToLowerUsingASCII(String name) {
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int ascii = ch;
			if (ascii >= 65 && ascii <= 90) {
				ch1 = (char) (ch + 32);
				temp += ch1;
			}
			if (ascii >= 97 && ascii <= 122) {
				ch1 = (char) (ch - 32);
				temp += ch1;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		SumAndConvresion sumConversion = new SumAndConvresion();
		String input = "TTe1ch8n9oC6reDi5TS1";
		System.out.println("Before-String is:" + input);
		/*
		 * int capturSum=sum.sumOfNumberFromString(input); String String
		 * captureString=sum.upperToLowerUsingASCII(input);
		 * System.out.println("String Is:"+capturSum+ ""+captureString);
		 * 
		 */

		System.out.println("After-String is:" + sumConversion.sumOfNumberFromString(input) + ""
				+ sumConversion.upperToLowerUsingASCII(input));
	}
}
