package mrunal;
/*Assignment 32: 3rd Dec'2020
Program 3: write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z].
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98
*/

public class prog3 {

	int displayAsciiOfCharacter(char ch) {
		System.out.println("Input character is: " + ch);
		int ascii = ch;
		return ascii;
	}

	char displayCharOfAscii(int ascii) {
		System.out.println("Input ascii value is: " + ascii);
		char ch = (char) ascii;
		return ch;
	}

	void printAsciiValuesForUppercaseLetters() {
		System.out.println("ASCII values of A to Z are:");
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int ascii = ch;
			System.out.println(ch + " -> " + ascii);
		}
	}

	void printAsciiValuesForLowercaseLetters() {
		System.out.println("ASCII values of a to z are:");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int ascii = ch;
			System.out.println(ch + " -> " + ascii);
		}
	}

	public static void main(String[] args) {
		prog3 program3 = new prog3();
		System.out.println("Ascii value of given character is: " + program3.displayAsciiOfCharacter('G'));
		System.out.println();
		System.out.println("Character of given Ascii value is: " + program3.displayCharOfAscii(80));
		System.out.println();
		program3.printAsciiValuesForUppercaseLetters();
		System.out.println();
		program3.printAsciiValuesForLowercaseLetters();
	}
}