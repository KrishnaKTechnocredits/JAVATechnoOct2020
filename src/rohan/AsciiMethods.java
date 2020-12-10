package rohan;

/*
Program 3:  write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z]. 
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98
 */

public class AsciiMethods {
	
	public static void main(String[] args) {
		char ch = 'Z';
		System.out.println("Ascii value of "+ch+": "+getAsciiValue(ch)); 
		int ascii = 89;
		System.out.println("Character value of "+ascii+": "+getCharacterValue(ascii));
		getUpperCaseAscii();
		System.out.println("--------------------------");
		getLowerCaseAscii();
	}
	
	static int getAsciiValue(char ch) {
		int ascii = ch;
		return ascii;
	}
	
	static char getCharacterValue(int ascii) {
		char ch = (char)ascii;
		return ch;
	}
	
	static void getUpperCaseAscii() {
		for(char ch='A';ch<='Z';ch++) 
			System.out.println(ch+"-->"+(int)ch);
	}
	
	static void getLowerCaseAscii() {
		for(char ch='a';ch<='z';ch++)
			System.out.println(ch+"-->"+(int)ch);
	}

}
