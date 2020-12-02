/*Assignment - 26: 23rd Nov'2020  
convert all capital letters to small and small to capitial.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()*/

package shrutiS.assignment26;

public class CapitalSmallConversion {

	void convertCapitalAndSmallLetters(String input) {
		System.out.print("Output: ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
				System.out.print(ch);
			} else {
				ch = Character.toUpperCase(ch);
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		CapitalSmallConversion conversion = new CapitalSmallConversion();
		String input = "tE1GfrEsT";
		System.out.println("Input : " + input);
		conversion.convertCapitalAndSmallLetters(input);
	}
}
