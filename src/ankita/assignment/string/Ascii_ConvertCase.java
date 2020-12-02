/*Program 2:
Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"
*/
package ankita.assignment.string;

public class Ascii_ConvertCase {

	void convertCases(String str) {
		int num1 = 0;
		String temp = "";
		System.out.println("Input  :" + str);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
				num1 += Character.getNumericValue(str.charAt(i));
			else if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
				temp = temp + (char) (str.charAt(i) + 32);
			else if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
				temp = temp + (char) (str.charAt(i) - 32);
		}
		temp = num1 + temp;
		System.out.println("Output :" + temp);
	}

	public static void main(String[] args) {
		System.out.println("==Sum of all numbers and convert case==");
		String str = "Te1ch8n9oC6reDi5TS1";
		new Ascii_ConvertCase().convertCases(str);
	}
}
