package prasad;

/*String input = "hmPZ23i9Ws"
output = "239PZWhmis"; */

public class Reversestr {

	void compare(String word) {
		int[] numbers = new int[word.length()];
		String digits = "";
		String uppercaseletters = "";
		String lowercaseletters = "";
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isDigit(ch)) {
				digits = digits + ch;
			} else if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					uppercaseletters = uppercaseletters + ch;
				} else if (Character.isLowerCase(ch)) {
					lowercaseletters = lowercaseletters + ch;
				} else
					continue;
			}
		}
		System.out.println("Output string:- " + digits + uppercaseletters + lowercaseletters);
	}

	public static void main(String[] arg) {
		Reversestr reversestr = new Reversestr();
		String word = "hmPZ23i9Ws";
		System.out.println("Input string:- " + word);
		reversestr.compare(word);
	}
}
