/*Program : 2 
String input = "hmPZ23i9Ws"
output = "239PZWhmis";*/

package shrutiS.assignment18;

public class ArrangingCharSequence {

	void arrangingChar(String input) {
		String letter = "";
		String digit = "";
		String uppercase = "";
		String lowercase = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					uppercase = uppercase + ch;
				else
					lowercase = lowercase + ch;
			} else
				digit = digit + ch;
		}
		System.out.println("output : " + digit + uppercase + lowercase);
	}

	public static void main(String[] args) {
		ArrangingCharSequence arrangechar = new ArrangingCharSequence();
		String input = "hmPZ23i9Ws";
		System.out.println("Input : " + input);
		arrangechar.arrangingChar(input);
	}
}
