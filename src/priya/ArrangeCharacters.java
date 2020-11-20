//Program : 2 : String input = "hmPZ23i9Ws"
//output = "239PZWhmis";

package priya;

public class ArrangeCharacters {
	void getCombineLettersDigits(String input) {
		String digStr = "", lowerStr = "", upperStr = "";
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i)))
				digStr = digStr + input.charAt(i);
			if (Character.isLowerCase(input.charAt(i)))
				lowerStr = lowerStr + input.charAt(i);
			if (Character.isUpperCase(input.charAt(i)))
				upperStr = upperStr + input.charAt(i);
		}
		System.out.println("String restructered : " + digStr + upperStr + lowerStr);
	}

	public static void main(String[] args) {
		new ArrangeCharacters().getCombineLettersDigits("hmPZ23i9Ws");
	}
	
}
