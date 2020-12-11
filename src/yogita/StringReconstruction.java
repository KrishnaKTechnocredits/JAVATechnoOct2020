/*

String input = "hmPZ23i9Ws"
output = "239PZWhmis";

*/

package yogita;

class StringReconstruction {

	String digit = "", lowerCase = "", upperCase = "", specialCase = "";

	void display(String arr) {

		for (int index = 0; index < arr.length(); index++) {
			char ch = arr.charAt(index);

			if (Character.isDigit(ch))
				digit += ch;

			else if (Character.isLowerCase(ch))
				lowerCase += ch;

			else if (Character.isUpperCase(ch))

				upperCase += ch;

			else
				specialCase += ch;

		}

		System.out.println("String Is :" + arr);
		System.out.println("Reconstructed String is:" + digit + upperCase + lowerCase + specialCase);

	}

	public static void main(String[] args) {
		StringReconstruction str = new StringReconstruction();
		String name = ("hmPZ23i9Ws");
		str.display(name);
	}
}