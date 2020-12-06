package ritika.Assignments;

/*Assignment 31 : 2nd Dec 2020

Program 2:
Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"
*/
public class Asgmt_31_Pg2 {

	static void StringOpersationsUsingASCII(String input) {
		System.out.println("Input: " + input);
		String output = "";
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			int chAscii = input.charAt(i);
			if (chAscii >= 48 && chAscii <= 57) {
				int temp = chAscii-48;
				sum = sum + temp;
			} else if (chAscii >= 65 && chAscii <= 90) {
				chAscii = chAscii + 32;
				output = output + (char) chAscii;
			} else if (chAscii >= 97 && chAscii <= 122) {
				chAscii = chAscii - 32;
				output = output + (char) chAscii;
			}
		}
		output = sum + output;
		System.out.println("Output: " + output);
	}

	public static void main(String[] args) {
		String given = "Te1ch8n9oC6reDi5TS1";
		Asgmt_31_Pg2.StringOpersationsUsingASCII(given);
	}
}
