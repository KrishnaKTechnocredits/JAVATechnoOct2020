package priyanka.Assignment_18;

/*Program : 2 
String input = "hmPZ23i9Ws"
output = "239PZWhmis";*/

public class OriganizeTheString {

	void stringSequence(String str) {

		String letter = "";
		String digit = "";
		String upperCaseLetters = "";
		String lowerCaseLetters = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = (str.charAt(index));
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					upperCaseLetters = upperCaseLetters + ch;
				else
					lowerCaseLetters = lowerCaseLetters + ch;
			} else
				digit = digit + ch;
		}
		System.out.println("Output string is: " + digit + upperCaseLetters + lowerCaseLetters);
	}

	public static void main(String[] args) {
		OriganizeTheString origanizeTheString = new OriganizeTheString();
		String str = "hmPZ23i9Ws";
		System.out.println("The String is :" + str);
		origanizeTheString.stringSequence(str);

	}

}
