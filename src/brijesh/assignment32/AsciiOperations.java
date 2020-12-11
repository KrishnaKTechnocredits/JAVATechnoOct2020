package brijesh.assignment32;

import mrunal.numberOfVowels;

/*
write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z]. 
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98
*/

public class AsciiOperations {
	public void charToAscii(char character) {
		System.out.println("Given character: "+String.valueOf(character)+", Ascii of given character: "+(int)character);
	}
	
	public void asciiToChar(int ascii) {
		System.out.println("Given ascii: "+ascii+", Character of given ascii: "+(char)ascii);
	}
	
	public void asciiOfUpperCase() {
		System.out.println("Ascii of A to Z:");
		for(char character= 'A'; character <= 'Z'; character++) {
			System.out.println(character+" -> "+ (int)character);
		}
	}
	
	public void asciiOfLowerCase() {
		System.out.println("Ascii of a to z:");
		for(char character= 'a'; character <= 'z'; character++) {
			System.out.println(character+" -> "+ (int)character);
		}
	}

	public static void main(String[] args) {
		AsciiOperations asciiOperations = new AsciiOperations();
		asciiOperations.charToAscii('A');
		asciiOperations.asciiToChar(119);
		asciiOperations.asciiOfUpperCase();
		asciiOperations.asciiOfLowerCase();
	}

}
