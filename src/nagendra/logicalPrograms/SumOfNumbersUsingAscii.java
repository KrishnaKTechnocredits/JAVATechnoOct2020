package nagendra.logicalPrograms;

/*
 Program 2:
Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"
*/

public class SumOfNumbersUsingAscii {

	void convertUpperCasetoLower(String input) {
		String output = "";
		int number = 0;
		for (int i = 0; i < input.length(); i++) {
			int value = input.charAt(i);
			if (value >= 65 && value <= 95) {
				int temp1 = value + 32;
				char temp = (char) temp1;
				output += temp;
			} else if (value >= 97 && value <= 127) {
				int temp1 = value - 32;
				char temp = (char) temp1;
				output += temp;
			} else if (value >= 49 && value <= 57) {
				int temp = value;
				char temp1 = (char) temp;
				String num = String.valueOf(temp1);
				number += Integer.parseInt(num);
			}
		}
		System.out.println("Output for " + input + "-> " + (number + output));
	}

	public static void main(String[] args) {
		SumOfNumbersUsingAscii object = new SumOfNumbersUsingAscii();
		String input = "Te1ch8n9oC6reDi5TS1";
		object.convertUpperCasetoLower(input);
	}
}
