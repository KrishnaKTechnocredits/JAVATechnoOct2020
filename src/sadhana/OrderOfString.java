package sadhana;

/*
Assignment_18
Program : 2 
String input = "hmPZ23i9Ws"
output = "239PZWhmis";
*/

public class OrderOfString {

	public void printCorrectOrderOfString(String name) {
		System.out.println("Given String: " + name);
		String digit = "", capital = "", small = "", special = "";

		for (int index = 0; index < name.length(); index++) {
			char character = name.charAt(index);
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
		OrderOfString orderOfString = new OrderOfString();
		orderOfString.printCorrectOrderOfString("hmPZ23i9Ws");

	}

}
