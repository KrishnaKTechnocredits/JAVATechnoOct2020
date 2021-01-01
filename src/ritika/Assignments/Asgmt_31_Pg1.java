package ritika.Assignments;

/*Assignment 31 : 2nd Dec 2020

Program 1:
Convert UpperCase into a LowerCase using ASCII
Given String = "TechnoCreditS"
Expected String = "technocredits"
*/
public class Asgmt_31_Pg1 {

	static void convertStringUsingASCII(String input) {
		System.out.println("Input: " + input);
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			int chAscii = input.charAt(i);
			if (chAscii >= 65 && chAscii <= 90) {
				chAscii = chAscii + 32;
				output = output + (char) chAscii;
			} else
				output = output + input.charAt(i);
		}
		System.out.println("Output: " + output);
	}

	public static void main(String[] args) {
		String given = "TechnoCreditS";
		Asgmt_31_Pg1.convertStringUsingASCII(given);
	}
}
