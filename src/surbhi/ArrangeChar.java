package surbhi;
public class ArrangeChar {

	public void arrangeCharacters(String string) {
		System.out.println("Given String: " + string);
		String digit = "", capital = "", small = "", special = "";
		for (int index = 0; index < string.length(); index++) {
			char character = string.charAt(index);
			if (Character.isUpperCase(character))
				capital += character;
			else if (Character.isLowerCase(character))
				small += character;
			else if (Character.isDigit(character))
				digit += character;
			else
				special += character;
		}
		System.out.println("Updated String: " + digit + capital + small + special);
	}

	public static void main(String[] args) {
		ArrangeChar arrangeChar = new ArrangeChar();
		arrangeChar.arrangeCharacters("hmPZ23i9WsH$");
	}
}
