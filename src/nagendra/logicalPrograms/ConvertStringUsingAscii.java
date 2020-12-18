package nagendra.logicalPrograms;

/*
 Program 1: 
Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"
*/

public class ConvertStringUsingAscii {

	void convertUpperCasetoLower(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			int a = input.charAt(i);
			if (a >= 65 && a <= 95) {
				int temp1 = a + 32;
				char temp = (char) temp1;
				output += temp;
			} else
				output += input.charAt(i);
		}
		System.out.println("Output for " + input + "-> " + output);
	}

	public static void main(String[] args) {
		
		ConvertStringUsingAscii object = new ConvertStringUsingAscii();
		String input = "TechnoCreditS";
		object.convertUpperCasetoLower(input);
	}
}
