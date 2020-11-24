package tejashree;

import java.util.Scanner;

/*
1) boolean isDigit(char ch)
Character.isDigit('z'); false
Character.isDigit('_'); false

2) boolean isLetter(char ch)
Character.isLetter('p'); true
Character.isLetter('_'); false

3) boolean isUpperCase(char ch)
Character.isUpperCase('z'); false

4) boolean isLowerCase(char ch)
Character.isLowerCase('A'); false   
-------------------------------------------------------
Exam 2 : WAP for below given requirement. [30][45]
input : teCh@N12JCR#iT8s_B
output : letters -> 12
     uppercase -> 7
     lowercase -> 5
     digit -> 3
     special char -> 3   	*/

public class CharacterMethods {

	public static void main(String[] args) {
		System.out.println("Please Enter a String");
		Scanner scanner = new Scanner(System.in);
		new CharacterMethods().rearrangeCharactersString(scanner.next());
	}

	void rearrangeCharactersString(String inputString) {
		String digits = "";
		String capitalLetters = "";
		String smallLetters = "";
		String specialcharacters = "";
		for (int index = 0; index < inputString.length(); index++) {
			char character = inputString.charAt(index);
			if (Character.isLetter(character)) {
				if (Character.isUpperCase(character))
					capitalLetters += character;
				if (Character.isLowerCase(character))
					smallLetters += character;
			} else if (Character.isDigit(character))
				digits += character;
			else
				specialcharacters += character;
		}

		System.out.println("Rearranged String : " + digits + capitalLetters + smallLetters + specialcharacters);
	}
}
	