package rohit;

//To print the character in sequence from the given String.
import java.util.Scanner;

public class Charactersequence {

	void arrangingChar(String str) {
		String letter = "";
		String digit = "";
		String uppercase = "";
		String lowercase = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
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
		Charactersequence charactersequence = new Charactersequence();
		String str = "hmPZ23i9Ws";
		System.out.println("Input String: " + str);
		charactersequence.arrangingChar(str);

	}

}