/*Program : 2 
String input = "hmPZ23i9Ws"
output = "239PZWhmis";*/

package kajol;

import java.util.Scanner;

public class CharacterMethods {
	
	void rearrangeCharactersString(String inputString) {
		String digits="";
		String capitalLetters="";
		String smallLetters="";
		String specialcharacters="";
		for(int index=0;index<inputString.length();index++) {
			char character=inputString.charAt(index);
			if(Character.isLetter(character)) {
				if(Character.isUpperCase(character))
				capitalLetters+=character;
				if(Character.isLowerCase(character))
					smallLetters+=character;
			}
			else if(Character.isDigit(character))
				digits+=character;
			else 
				specialcharacters+=character;
		} 
			
		System.out.println("Rearranged String : "+digits+capitalLetters+smallLetters+specialcharacters);
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter a String");
		Scanner scanner= new Scanner(System.in);
		new CharacterMethods().rearrangeCharactersString(scanner.next());
		scanner.close();
	}

}
