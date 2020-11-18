/*Program : 2 
String input = "hmPZ23i9Ws"
output = "239PZWhmis";*/

package poojap;

public class Assignment18 {

	public static void main(String[] args) {
		String input = "hmPZ23i9Ws";
		String digit = "", upper = "", lower = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (Character.isUpperCase(ch)) {
				upper = upper + ch;
			} else if (Character.isLowerCase(ch))
				lower = lower + ch;
		}
		System.out.println("String is: " + input);
		System.out.println("Updated String is: " + digit + upper + lower);
	}
}
