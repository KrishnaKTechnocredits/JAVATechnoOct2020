package vaibhav.assignment32;

/*Program 3:  write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z]. 
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98*/

import javax.swing.SingleSelectionModel;

public class ASCIIAndCharacters {
	
	public static int getASCIIvalue(char ch) {
		int temp =ch;		
		return temp;	
	}
	
	public static char getCharacter(int x) {
		char ch=(char)x;		
		return ch;
	}
	
	public static void displayASCIIValueForUppercase() {
		for (int i = 65 ; i <= 90 ;i++) {
			System.out.print(" "+(char)i+"-->"+i);
		}		
	}
	
	public static void displayASCIIValueForLowercase() {
		System.out.println();
		for (int i = 97 ; i <= 122 ;i++) {
			System.out.print(" "+(char)i+"-->"+i);
		}		
	}

	public static void main(String[] args) {
		char ch = 'a';
		int x = 65;
		int ascii=ASCIIAndCharacters.getASCIIvalue(ch);
		System.out.println("ASCII value of your character is "+ascii);
		System.out.println();		
		char ch1=ASCIIAndCharacters.getCharacter(x);
		System.out.println("Character of ASCII value "+ch1);
		System.out.println();	
		ASCIIAndCharacters.displayASCIIValueForUppercase();
		System.out.println();
		ASCIIAndCharacters.displayASCIIValueForLowercase();
	}
}
