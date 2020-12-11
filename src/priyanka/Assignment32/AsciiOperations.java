package priyanka.Assignment32;

import java.util.Scanner;

/*Program 3:  write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z]. 
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98*/

public class AsciiOperations {

	void returnAsciiValue(char ch) {
		System.out.println("The Ascii value for charater is " + (int) ch);
	}

	void returnCharacterValue(int ascii) {
		System.out.println("The Ascii value for charater is " + (char) ascii);
	}

	void printAsciiForUpperCaseLetters() {
		System.out.println("Ascii values of A to Z:");
		for (char character = 'A'; character <= 'Z'; character++) {
			System.out.println(character + " -> " + (int) character);
		}
	}

	void printAsciiForLowerCaseLetters() {
		System.out.println("Ascii values of a to z:");
		for (char character = 'a'; character <= 'z'; character++) {
			System.out.println(character + " -> " + (int) character);
		}

	}

	public static void main(String[] arg) {
		AsciiOperations asciiOperations = new AsciiOperations();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Character to find Ascii value : ");
		char ch = scanner.next().charAt(0);
		asciiOperations.returnAsciiValue(ch);
		System.out.println("Enter the number(ascii value) to find charater : ");
		int n = scanner.nextInt();
		asciiOperations.returnCharacterValue(n);
		asciiOperations.printAsciiForUpperCaseLetters();
		asciiOperations.printAsciiForLowerCaseLetters();

	}

}
